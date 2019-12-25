package com.whjx.pojo;

import java.io.Serializable;

public class ShopCart implements Serializable {
    private Integer shopcartId;

    private Integer shopcartUserId;

    private Integer shopcartSpuId;

    private Integer shopcartShopNumber;

    private static final long serialVersionUID = 1L;

    public Integer getShopcartId() {
        return shopcartId;
    }

    public void setShopcartId(Integer shopcartId) {
        this.shopcartId = shopcartId;
    }

    public Integer getShopcartUserId() {
        return shopcartUserId;
    }

    public void setShopcartUserId(Integer shopcartUserId) {
        this.shopcartUserId = shopcartUserId;
    }

    public Integer getShopcartSpuId() {
        return shopcartSpuId;
    }

    public void setShopcartSpuId(Integer shopcartSpuId) {
        this.shopcartSpuId = shopcartSpuId;
    }

    public Integer getShopcartShopNumber() {
        return shopcartShopNumber;
    }

    public void setShopcartShopNumber(Integer shopcartShopNumber) {
        this.shopcartShopNumber = shopcartShopNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopcartId=").append(shopcartId);
        sb.append(", shopcartUserId=").append(shopcartUserId);
        sb.append(", shopcartSpuId=").append(shopcartSpuId);
        sb.append(", shopcartShopNumber=").append(shopcartShopNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}