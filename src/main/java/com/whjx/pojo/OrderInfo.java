package com.whjx.pojo;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class OrderInfo {
    private Integer oiDetailsId;
    private Integer orOrderId;
    private Integer orderGoodsId;
    private String goodsName;
    private Integer goodsCount;
    private BigDecimal goodsPrice;

}
