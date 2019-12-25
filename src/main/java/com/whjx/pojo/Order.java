package com.whjx.pojo;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
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

    private Long orderFreight;

    private Long orderActualPayment;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public Integer getOrderAdId() {
        return orderAdId;
    }

    public void setOrderAdId(Integer orderAdId) {
        this.orderAdId = orderAdId;
    }

    public Integer getOrderPayId() {
        return orderPayId;
    }

    public void setOrderPayId(Integer orderPayId) {
        this.orderPayId = orderPayId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public Integer getOrderDeliveryStatus() {
        return orderDeliveryStatus;
    }

    public void setOrderDeliveryStatus(Integer orderDeliveryStatus) {
        this.orderDeliveryStatus = orderDeliveryStatus;
    }

    public Date getOrderFoundTime() {
        return orderFoundTime;
    }

    public void setOrderFoundTime(Date orderFoundTime) {
        this.orderFoundTime = orderFoundTime;
    }

    public Date getOrderPaymentTime() {
        return orderPaymentTime;
    }

    public void setOrderPaymentTime(Date orderPaymentTime) {
        this.orderPaymentTime = orderPaymentTime;
    }

    public Date getOrderShipmentsTime() {
        return orderShipmentsTime;
    }

    public void setOrderShipmentsTime(Date orderShipmentsTime) {
        this.orderShipmentsTime = orderShipmentsTime;
    }

    public Date getOrderReceivingTime() {
        return orderReceivingTime;
    }

    public void setOrderReceivingTime(Date orderReceivingTime) {
        this.orderReceivingTime = orderReceivingTime;
    }

    public Long getOrderFreight() {
        return orderFreight;
    }

    public void setOrderFreight(Long orderFreight) {
        this.orderFreight = orderFreight;
    }

    public Long getOrderActualPayment() {
        return orderActualPayment;
    }

    public void setOrderActualPayment(Long orderActualPayment) {
        this.orderActualPayment = orderActualPayment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderUserId=").append(orderUserId);
        sb.append(", orderAdId=").append(orderAdId);
        sb.append(", orderPayId=").append(orderPayId);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", orderDeliveryStatus=").append(orderDeliveryStatus);
        sb.append(", orderFoundTime=").append(orderFoundTime);
        sb.append(", orderPaymentTime=").append(orderPaymentTime);
        sb.append(", orderShipmentsTime=").append(orderShipmentsTime);
        sb.append(", orderReceivingTime=").append(orderReceivingTime);
        sb.append(", orderFreight=").append(orderFreight);
        sb.append(", orderActualPayment=").append(orderActualPayment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}