package com.whjx.service.impl;

import com.whjx.dao.Itemkill;
import com.whjx.dao.KillMapper;
import com.whjx.dao.KillSuccessMapper;
import com.whjx.enums.SysConstant;
import com.whjx.pojo.Kill;
import com.whjx.pojo.KillSuccess;
import com.whjx.service.IKillService;
import com.whjx.service.RabbitmqSenderService;
import com.whjx.util.SnowFlake;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
//import org.redisson.api.RLock;
//import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author:debug (SteadyJack)
 * @Date: 2019/6/17 22:21
 **/
@Service
public class KillServiceImpl implements IKillService {

    private static final Logger log= LoggerFactory.getLogger(KillServiceImpl.class);

    private SnowFlake snowFlake=new SnowFlake(2,3);

    @Autowired
    private KillSuccessMapper killSuccessMapper;

    @Autowired
    private KillMapper killMapper;

    @Autowired
    private Itemkill itemkill;

    @Autowired
    private RabbitmqSenderService rabbitmqSenderService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    /**
     * 通用的方法-记录用户秒杀成功后生成的订单-并进行异步邮件消息的通知
     * @param kill
     * @param userId
     * @throws Exception
     */
    private void commonRecordKillSuccessInfo(Kill kill,Integer userId) throws Exception{
        //TODO:记录抢购成功后生成的秒杀订单记录

        KillSuccess killSuccess = new KillSuccess();
        String code = String.valueOf(snowFlake.nextId());
        Date date = new Date();//获得系统时间.
        SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
        String nowTime = sdf.format(date);
        Date time = sdf.parse( nowTime );
        killSuccess.setCreatTime(time);
        killSuccess.setKillCode(code);
        killSuccess.setKillId(kill.getKillId());
        killSuccess.setKillStatus(SysConstant.OrderStatus.SuccessNotPayed.getCode());
        killSuccess.setUserId(userId);


        int q = killSuccessMapper.countByKillId(kill.getKillId(), userId);
        System.out.println("结果是-------" + q);
        //TODO:学以致用，举一反三 -> 仿照单例模式的双重检验锁写法
        if (killSuccessMapper.countByKillId(kill.getKillId(),userId) <= 0){
            int res=killSuccessMapper.insertKillByKillUserId(killSuccess);
            if (res > 0){
                //TODO:进行异步邮件消息的通知=rabbitmq+mail
                rabbitmqSenderService.sendKillSuccessEmailMsg(code);

                //TODO:入死信队列，用于 “失效” 超过指定的TTL时间时仍然未支付的订单
                rabbitmqSenderService.sendKillSuccessOrderExpireMsg(code);
            }
        }
    }
    /**
     * 商品秒杀核心业务逻辑的处理-redis的分布式锁
     * @param killId
     * @param userId
     * @return
     * @throws Exception
     */
//    @Override
//    public boolean killItemV3(Integer killId, Integer userId) throws Exception {
//        Boolean result = false;
//
//        if (killSuccessMapper.countByKillId(killId,userId) <= 0){
//
//            //TODO:借助Redis的原子操作实现分布式锁-对共享操作-资源进行控制
//            ValueOperations valueOperations = stringRedisTemplate.opsForValue();
//            final String key =  new StringBuffer().append(killId).append(userId).append("-RedisLock").toString();
//            final String value = String.valueOf(snowFlake.nextId());
//            Boolean cacheRes = valueOperations.setIfAbsent(key,value); //luna脚本提供“分布式锁服务”，就可以写在一起
//            //TOOD:redis部署节点宕机了
//            if (cacheRes){
//                stringRedisTemplate.expire(key,30, TimeUnit.SECONDS);
//
//                try {
//                    Kill itemKill = killMapper.selectById(killId);
//                    if (itemKill != null && 1 == itemKill.getCanKill() && itemKill.getKillCount() > 0){
//                        int res = itemkill.updateKillCount(killId);
//                        if (res>0){
//                            commonRecordKillSuccessInfo(itemKill,userId);
//
//                            result=true;
//                        }
//                    }
//                }catch (Exception e){
//                    throw new Exception("还没到抢购日期、已过了抢购时间或已被抢购完毕！");
//                }finally {
//                    if (value.equals(valueOperations.get(key).toString())){
//                        stringRedisTemplate.delete(key);
//                    }
//                }
//            }
//        }else{
//            throw new Exception("Redis-您已经抢购过该商品了!");
//        }
//        return result;
//    }


    @Autowired
    private CuratorFramework curatorFramework;

    private static final String pathPrefix="/kill/zkLock/";

    /**
     * 商品秒杀核心业务逻辑的处理-基于ZooKeeper的分布式锁
     * @param killId
     * @param userId
     * @return
     * @throws Exception
     */
    @Override
    public boolean killItemV5(Integer killId, Integer userId) throws Exception {
        Boolean result = false;
        killMapper.updateCanKill();
        InterProcessMutex mutex = new InterProcessMutex(curatorFramework,pathPrefix+killId+userId+"-lock");
        try {
            if (mutex.acquire(10L,TimeUnit.SECONDS)){

                //TODO:核心业务逻辑
                if (killSuccessMapper.countByKillId(killId,userId) <= 0){
                    Kill itemKill = killMapper.selectById(killId);

                    if (itemKill != null && 1 == itemKill.getCanKill() && itemKill.getKillCount() > 0){
                        int res = itemkill.updateKillCount(killId);
                        if (res > 0){
                            commonRecordKillSuccessInfo(itemKill,userId);
                            result = true;
                        }
                    }
                }else{
                    throw new Exception("您已经抢购过该商品了!");
                }
            }
        }catch (Exception e){
            throw new Exception("还没到抢购日期、已过了抢购时间或已被抢购完毕！");
        }finally {
            if (mutex != null){
                mutex.release();
            }
        }
        return result;
    }
}
