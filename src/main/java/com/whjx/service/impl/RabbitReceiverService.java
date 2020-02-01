package com.whjx.service.impl;

import com.whjx.dao.KillSuccessMapper;
import com.whjx.dto.MailDto;
import com.whjx.pojo.KillSuccess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * 秒杀异步接收消息
 * @author 张晓
 * @data 2020/1/3
 */
@Service
public class RabbitReceiverService {
    private static final Logger log = LoggerFactory.getLogger(RabbitReceiverService.class);

    @Autowired
    private Environment env;

    @Autowired
    private MailService mailService;

    @Autowired
    private KillSuccessMapper killSuccessMapper;

    /**
     * 消费者接收消息
     */
    @RabbitListener(queues = {"${mq.kill.item.success.email.queue}"},containerFactory = "singleListenerContainer")
    public void consumeEmailMsg(KillSuccess info){
        try {
            log.info("秒杀成功异步接收消息--开始",info);

            //TODO:真正的发送邮件
            String[] userEmail = {info.getUserInfo().getEmail()};
            for (String a:userEmail) {
                System.out.println(a);
            }

            final String content = String.format(env.getProperty("mail.kill.item.success.content") + "订单编号为" + info.getKillCode());
            MailDto dto=new MailDto();
            dto.setSubject(env.getProperty("mail.kill.item.success.content"));
            dto.setContent(content);
            dto.setTos(userEmail);
            mailService.sendSimpleEmail(dto);
        }catch (Exception e){
            log.error("秒杀成功异步接收消息--发生异常");
        }
    }

    /**
     * 用户秒杀成功后超时未支付-监听者
     * @param info
     */
    @RabbitListener(queues = {"${mq.kill.item.success.kill.dead.real.queue}"},containerFactory = "singleListenerContainer")
    public void consumeExpireOrder(KillSuccess info){
        try {
            log.info("用户秒杀成功后超时未支付-监听者-接收消息:{}",info);

            if (info != null){
                KillSuccess entity = killSuccessMapper.selectByOrder(info.getKillCode());
                if (entity != null && entity.getKillStatus().intValue() == 0){
                    killSuccessMapper.expirOrder(info.getKillCode());
                }

            }
        }catch (Exception e){
            log.error("用户秒杀成功后超时未支付-监听者-发生异常：",e.fillInStackTrace());
        }
    }
}
