package com.whjx.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Pay {
    private Integer payId;//支付id
    private Integer payUserId;//用户id(关联用户表的用户id)
    private String payOrderNumber;//订单编号
    private String payTransactionNumber;//微信交易号
    private BigDecimal payMoney;//支付金额
    private Date payTime;//支付时间
    private Integer payStaus;//支付状态(0，待付款；1，已付款；2未付款)

}
