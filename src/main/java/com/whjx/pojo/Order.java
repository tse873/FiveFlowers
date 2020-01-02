package com.whjx.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Order {
    private Integer orderId;
    private Integer orderUserId;
    private Integer orderAdId;
    private Integer orderPayId;
    private String orderNumber;
    private Integer orderDeliveryStatus;
    private Date orderFoundTime;
    private Date orderPaymentTime;
    private Date orderShipmentsTime;
    private Date orderReceivingTime;
    private BigDecimal orderFreight;
    private BigDecimal orderActualPayment;
}
