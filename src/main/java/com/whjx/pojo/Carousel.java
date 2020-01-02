package com.whjx.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Carousel {
    private  Integer carouselId;//轮播图
    private String carouselUrl;//轮播图路径
    private Integer carouselIsshow;//是否展示（0，否/1，是）
    private Date carouselCreatetime;//创建时间
    private Date carouselUpdateTime;//更新时间
    private List<String> carouselUrls;
}
