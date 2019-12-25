package com.whjx.pojo;

import java.io.Serializable;

public class Integral implements Serializable {
    private Integer integralId;

    private Integer integralUserId;

    private Integer integralSource;

    private Integer integralOrderId;

    private static final long serialVersionUID = 1L;

    public Integer getIntegralId() {
        return integralId;
    }

    public void setIntegralId(Integer integralId) {
        this.integralId = integralId;
    }

    public Integer getIntegralUserId() {
        return integralUserId;
    }

    public void setIntegralUserId(Integer integralUserId) {
        this.integralUserId = integralUserId;
    }

    public Integer getIntegralSource() {
        return integralSource;
    }

    public void setIntegralSource(Integer integralSource) {
        this.integralSource = integralSource;
    }

    public Integer getIntegralOrderId() {
        return integralOrderId;
    }

    public void setIntegralOrderId(Integer integralOrderId) {
        this.integralOrderId = integralOrderId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", integralId=").append(integralId);
        sb.append(", integralUserId=").append(integralUserId);
        sb.append(", integralSource=").append(integralSource);
        sb.append(", integralOrderId=").append(integralOrderId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}