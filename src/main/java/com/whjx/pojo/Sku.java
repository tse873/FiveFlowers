package com.whjx.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Sku {
    private Integer skuId;
    private Integer skuSpuId;
    private String skuTitle;
    private BigDecimal skuPrice;
    private String skuDescribe;
    private Integer skuInventoryId;
}
