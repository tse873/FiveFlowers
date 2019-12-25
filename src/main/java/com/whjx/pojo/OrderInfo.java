package com.whjx.pojo;

import java.io.Serializable;

public class OrderInfo implements Serializable {
    private Integer oiDetailsId;

    private Integer orOrderId;

    private Integer orderGoodsId;

    private String goodsName;

    private Integer goodsCount;

    private Long goodsPrice;

    private static final long serialVersionUID = 1L;

    public Integer getOiDetailsId() {
        return oiDetailsId;
    }

    public void setOiDetailsId(Integer oiDetailsId) {
        this.oiDetailsId = oiDetailsId;
    }

    public Integer getOrOrderId() {
        return orOrderId;
    }

    public void setOrOrderId(Integer orOrderId) {
        this.orOrderId = orOrderId;
    }

    public Integer getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Integer orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Long getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Long goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oiDetailsId=").append(oiDetailsId);
        sb.append(", orOrderId=").append(orOrderId);
        sb.append(", orderGoodsId=").append(orderGoodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsCount=").append(goodsCount);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}