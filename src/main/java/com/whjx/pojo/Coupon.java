package com.whjx.pojo;

import java.io.Serializable;
import java.util.Date;

public class Coupon implements Serializable {
    private Integer couponId;

    private String couponName;

    private Integer couponNum;

    private String couponDescription;

    private Date couponUserTerm;

    private Date couponExchangeTime;

    private static final long serialVersionUID = 1L;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public Integer getCouponNum() {
        return couponNum;
    }

    public void setCouponNum(Integer couponNum) {
        this.couponNum = couponNum;
    }

    public String getCouponDescription() {
        return couponDescription;
    }

    public void setCouponDescription(String couponDescription) {
        this.couponDescription = couponDescription == null ? null : couponDescription.trim();
    }

    public Date getCouponUserTerm() {
        return couponUserTerm;
    }

    public void setCouponUserTerm(Date couponUserTerm) {
        this.couponUserTerm = couponUserTerm;
    }

    public Date getCouponExchangeTime() {
        return couponExchangeTime;
    }

    public void setCouponExchangeTime(Date couponExchangeTime) {
        this.couponExchangeTime = couponExchangeTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", couponId=").append(couponId);
        sb.append(", couponName=").append(couponName);
        sb.append(", couponNum=").append(couponNum);
        sb.append(", couponDescription=").append(couponDescription);
        sb.append(", couponUserTerm=").append(couponUserTerm);
        sb.append(", couponExchangeTime=").append(couponExchangeTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}