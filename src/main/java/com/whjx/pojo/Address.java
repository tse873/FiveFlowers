package com.whjx.pojo;

import lombok.Data;

@Data
public class Address {
    private Integer adId;
    private String adProvince;
    private String adCity;
    private String adDistrict;
    private String adSite;
    private String adName;
    private String adTel;
    private String adOpenId;
    private Integer adIsdefault;
}