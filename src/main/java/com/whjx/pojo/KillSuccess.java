package com.whjx.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.sql.Time;
import java.util.Date;


@Data
public class KillSuccess {
    private Integer successId;
    private String killCode;
    private Integer userId;
    private Integer killId;
    private Integer killStatus;
    private Date creatTime;
    private UserInfo userInfo;
    private Spu spu;
    private Integer DiffTime;
}
