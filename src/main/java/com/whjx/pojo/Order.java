package com.whjx.pojo;

import lombok.Data;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
@Data
@Table(name = "w_order")
public class Order {
    private String orderId;//订单id
    private Double payment;//实付金额，精确到两位小数
    private Integer paymentType;//支付类型，1.在线支付，2.货到付款
    private BigDecimal postFee;//邮费，精确到两位
    private Integer status;//状态，0.未付款，1.已付款，2.未发货，3.已发货，4.交易成功，5.交易关闭				0	0
    private Date createTime;//订单创建时间
    private Date updateTime;//订单更新时间
    private Date paymentTime;//付款时间
    private Date consignTime;//发货时间
    private Date endTime;//交易完成时间
    private Date closeTime;//交易关闭时间
    private String shippingName;//物流名称
    private String shippingCode;//物流单号
    private String openId;//用户id
    private String buyerMessage;//买家留言
    private String buyerNick;//买家昵称
    private Integer buyerRate;//买家是否已评论 0,未评论/1，已评论
    private Integer DiffTime;
}
