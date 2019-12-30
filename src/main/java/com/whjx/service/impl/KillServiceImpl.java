package com.whjx.service.impl;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.whjx.dao.Itemkill;
import com.whjx.dao.KillMapper;
import com.whjx.enums.SysConstant;
import com.whjx.pojo.Kill;
import com.whjx.pojo.KillSuccess;
import com.whjx.service.IKillService;
import com.whjx.util.SnowFlake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 张晓
 * @Data: 2019/12/27
 */
@Service
public class KillServiceImpl implements IKillService {
    private final static Logger log = LoggerFactory.getLogger(KillServiceImpl.class);
    private SnowFlake snowFlake = new SnowFlake(2,3);

    @Autowired
    private Itemkill itemkill;

    @Autowired
    private KillMapper killMapper;
    @Override
    public boolean killItem(Integer killId, Integer userId) throws Exception {
        boolean result = false;

        //TODO:判断当前用户是否已经抢购过当前商品
        int res = itemkill.countByKillUserId(killId, userId);
        if (res <= 0){
            killMapper.updateCanKill();
            Kill kill = killMapper.selectById(killId);
            //TODO:判断当前待抢购的商品是否充足,以及是否处在可抢时间段内  -canKill
            if (kill != null && kill.getCanKill() == 1){
                //TODO:扣减库存 -1
                int i = itemkill.updateKillCount(killId);
                //TODO:判断是否扣减成功?生成秒杀订单,通知用户下单成功
                if (i > 0){
                    commonRecordKillSuccessInfo(kill,userId);
                    result = true;
                }
            }
        }else{
            throw new Exception("您已经抢购过了");
        }
        return result;
    }
    private void commonRecordKillSuccessInfo(Kill kill,Integer userId)throws Exception{
        KillSuccess killSuccess = new KillSuccess();
        Date date = new Date();//获得系统时间.
        SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
        String nowTime = sdf.format(date);
        Date time = sdf.parse( nowTime );
        killSuccess.setCreatTime(time);
        killSuccess.setKillCode(String.valueOf(snowFlake.nextId()));
        killSuccess.setKillId(kill.getKillId());
        killSuccess.setKillStatus(SysConstant.OrderStatus.SuccessNotPayed.getCode());
        killSuccess.setUserId(userId);

        itemkill.insertKillByKillUserId(killSuccess);

    }
}
