package com.whjx.service.impl;

import com.whjx.dto.MailDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    private final static Logger log = LoggerFactory.getLogger(MailService.class);

    @Autowired
    private Environment env;

    @Autowired
    private JavaMailSender mailSender;
    public void sendSimpleEmail(MailDto dto){
        try {
            SimpleMailMessage message=new SimpleMailMessage();

            message.setFrom(env.getProperty("mail.send.from"));
            message.setTo(dto.getTos());
            message.setSubject(dto.getSubject());
            message.setText(dto.getContent());
            System.out.println(message);
            mailSender.send(message);

            log.info("发送简单文本文件-发送成功!");
        }catch (Exception e){
            log.error("发送简单文本文件-发生异常： ",e.fillInStackTrace());
        }

    }
}
