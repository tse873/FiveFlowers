package com.whjx.pojo;

import java.io.Serializable;
import java.util.Date;

public class ReturnMoney implements Serializable {
    private Integer returnMoneyId;

    private Integer orderId;

    private Integer userId;

    private Long returnMoney;

    private Date returnTime;

    private String returnShopComment;

    private String shopRejectReturnReason;

    private Byte returnStatus;

    private Date createTime;

    private String returnReason;

    private static final long serialVersionUID = 1L;

    public Integer getReturnMoneyId() {
        return returnMoneyId;
    }

    public void setReturnMoneyId(Integer returnMoneyId) {
        this.returnMoneyId = returnMoneyId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getReturnMoney() {
        return returnMoney;
    }

    public void setReturnMoney(Long returnMoney) {
        this.returnMoney = returnMoney;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public String getReturnShopComment() {
        return returnShopComment;
    }

    public void setReturnShopComment(String returnShopComment) {
        this.returnShopComment = returnShopComment == null ? null : returnShopComment.trim();
    }

    public String getShopRejectReturnReason() {
        return shopRejectReturnReason;
    }

    public void setShopRejectReturnReason(String shopRejectReturnReason) {
        this.shopRejectReturnReason = shopRejectReturnReason == null ? null : shopRejectReturnReason.trim();
    }

    public Byte getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Byte returnStatus) {
        this.returnStatus = returnStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason == null ? null : returnReason.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", returnMoneyId=").append(returnMoneyId);
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", returnMoney=").append(returnMoney);
        sb.append(", returnTime=").append(returnTime);
        sb.append(", returnShopComment=").append(returnShopComment);
        sb.append(", shopRejectReturnReason=").append(shopRejectReturnReason);
        sb.append(", returnStatus=").append(returnStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", returnReason=").append(returnReason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}