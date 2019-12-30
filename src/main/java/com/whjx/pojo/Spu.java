package com.whjx.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Spu {

    private Integer spuId;
    private String spuTitle;
    private Integer spuState;
    private Integer spuSc;
    private String spuDescribe;
    private String spuSpecification;
    private Integer spuRecommend;
    private String spuImgUrl;
    private List<Img> imgs;
    private BigDecimal spuPrice;
    private Date spuAddtime;

}
