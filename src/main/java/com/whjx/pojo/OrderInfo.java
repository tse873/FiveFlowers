package com.whjx.pojo;

import lombok.Data;
import javax.persistence.Table;

@Data
@Table(name = "w_orderinfo")
public class OrderInfo {
    private String oiDetailsId;
    private String orOrderId;
    private Integer orderGoodsId;
    private String goodsName;
    private Integer goodsCount;
    private Double goodsPrice;
    private Double totalFee;
}
