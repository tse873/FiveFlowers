package com.whjx.pojo;

import java.io.Serializable;
import java.util.Date;

public class ReturnFrom implements Serializable {
    private Integer returnId;

    private Integer orderId;

    private Byte returnType;

    private Integer userId;

    private Long retuenAmount;

    private String returnAnnex;

    private Byte returnStatus;

    private Date returnTime;

    private Date finalResultTime;

    private Byte finalHandleStaffid;

    private String returnReason;

    private String respondContent;

    private String finalResult;

    private static final long serialVersionUID = 1L;

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Byte getReturnType() {
        return returnType;
    }

    public void setReturnType(Byte returnType) {
        this.returnType = returnType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getRetuenAmount() {
        return retuenAmount;
    }

    public void setRetuenAmount(Long retuenAmount) {
        this.retuenAmount = retuenAmount;
    }

    public String getReturnAnnex() {
        return returnAnnex;
    }

    public void setReturnAnnex(String returnAnnex) {
        this.returnAnnex = returnAnnex == null ? null : returnAnnex.trim();
    }

    public Byte getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Byte returnStatus) {
        this.returnStatus = returnStatus;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Date getFinalResultTime() {
        return finalResultTime;
    }

    public void setFinalResultTime(Date finalResultTime) {
        this.finalResultTime = finalResultTime;
    }

    public Byte getFinalHandleStaffid() {
        return finalHandleStaffid;
    }

    public void setFinalHandleStaffid(Byte finalHandleStaffid) {
        this.finalHandleStaffid = finalHandleStaffid;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason == null ? null : returnReason.trim();
    }

    public String getRespondContent() {
        return respondContent;
    }

    public void setRespondContent(String respondContent) {
        this.respondContent = respondContent == null ? null : respondContent.trim();
    }

    public String getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(String finalResult) {
        this.finalResult = finalResult == null ? null : finalResult.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", returnId=").append(returnId);
        sb.append(", orderId=").append(orderId);
        sb.append(", returnType=").append(returnType);
        sb.append(", userId=").append(userId);
        sb.append(", retuenAmount=").append(retuenAmount);
        sb.append(", returnAnnex=").append(returnAnnex);
        sb.append(", returnStatus=").append(returnStatus);
        sb.append(", returnTime=").append(returnTime);
        sb.append(", finalResultTime=").append(finalResultTime);
        sb.append(", finalHandleStaffid=").append(finalHandleStaffid);
        sb.append(", returnReason=").append(returnReason);
        sb.append(", respondContent=").append(respondContent);
        sb.append(", finalResult=").append(finalResult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}