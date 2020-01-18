package com.whjx.pojo;

import lombok.Data;

import java.util.Date;


@Data
public class KillSuccess {
    private Integer successId;
    private String killCode;
    private String openId;
    private Integer killId;
    private Integer killStatus;
    private Date creatTime;
    private UserInfo userInfo;
    private Spu spu;
    private Integer DiffTime;
}
