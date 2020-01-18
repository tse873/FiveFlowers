package com.whjx.pojo;
import lombok.Data;

@Data
public class UserInfo {
    private int userId;
    private String openid;
    private String nickName;
    private String avatarUrl;
    private Integer gender;
    private String country;
    private String province;
    private String city;
    private String language;
    private String email;
}
