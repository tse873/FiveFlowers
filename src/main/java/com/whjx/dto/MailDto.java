package com.whjx.dto;

import lombok.Data;

@Data
public class MailDto {
    //邮件主题
    private String subject;
    //邮件内容
    private String content;
    //接收人
    private String[] tos;
}
