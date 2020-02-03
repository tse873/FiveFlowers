package com.whjx.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AdminInfo implements Serializable {
    private Integer adminId;
    private String adminName;
    private String adminPassword;
    private String adminTelphone;
    private Date adminCreatTime;
    private Integer adminStaus;
}