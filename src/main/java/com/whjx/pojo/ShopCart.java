package com.whjx.pojo;

import lombok.Data;

@Data
public class ShopCart {
    private String shopcartOpenId;
    private Integer shopcartSpuId;
    private Integer shopcartNumber;
    private Spu spu;
}
