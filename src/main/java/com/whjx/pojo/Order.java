package com.whjx.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Order {
    private Integer orderId;//订单id
    private Integer orderUserId;//用户id(关联用户表的用户id)
    private Integer orderAdId;//收货地址id(关联用户地址表的地址id)
    private Integer orderPayId;//支付id(关联支付表的支付id)
    private String orderNumber;//订单编号
    private Integer orderDeliveryStatus;//订单状态(0：待付款 1：待发货 2：待收货；3：已完成；4：已关闭；5：已回收；6：未回收)
    private Date orderFoundTime;//创建时间
    private Date orderPaymentTime;//付款时间
    private Date orderShipmentsTime;//发货时间
    private Date orderReceivingTime;//收货时间
    private BigDecimal orderFreight;//运费
    private BigDecimal orderActualPayment;//实付款

}
