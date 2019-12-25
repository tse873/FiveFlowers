package com.whjx.pojo;

import java.io.Serializable;
import java.util.Date;

public class Pay implements Serializable {
    private Integer payId;

    private Integer payUserId;

    private String payOrderNumber;

    private String payTransactionNumber;

    private Long payMoney;

    private Date payTime;

    private Integer payStaus;

    private static final long serialVersionUID = 1L;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public Integer getPayUserId() {
        return payUserId;
    }

    public void setPayUserId(Integer payUserId) {
        this.payUserId = payUserId;
    }

    public String getPayOrderNumber() {
        return payOrderNumber;
    }

    public void setPayOrderNumber(String payOrderNumber) {
        this.payOrderNumber = payOrderNumber == null ? null : payOrderNumber.trim();
    }

    public String getPayTransactionNumber() {
        return payTransactionNumber;
    }

    public void setPayTransactionNumber(String payTransactionNumber) {
        this.payTransactionNumber = payTransactionNumber == null ? null : payTransactionNumber.trim();
    }

    public Long getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getPayStaus() {
        return payStaus;
    }

    public void setPayStaus(Integer payStaus) {
        this.payStaus = payStaus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", payId=").append(payId);
        sb.append(", payUserId=").append(payUserId);
        sb.append(", payOrderNumber=").append(payOrderNumber);
        sb.append(", payTransactionNumber=").append(payTransactionNumber);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", payTime=").append(payTime);
        sb.append(", payStaus=").append(payStaus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}