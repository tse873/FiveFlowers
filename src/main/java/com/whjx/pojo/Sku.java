package com.whjx.pojo;

import java.io.Serializable;

public class Sku implements Serializable {
    private Integer skuId;

    private Integer skuSpu;

    private String skuTitle;

    private Long skuPrice;

    private String skuDescribe;

    private Integer skuInventory;

    private Integer skuRecommend;

    private static final long serialVersionUID = 1L;

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuSpu() {
        return skuSpu;
    }

    public void setSkuSpu(Integer skuSpu) {
        this.skuSpu = skuSpu;
    }

    public String getSkuTitle() {
        return skuTitle;
    }

    public void setSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle == null ? null : skuTitle.trim();
    }

    public Long getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Long skuPrice) {
        this.skuPrice = skuPrice;
    }

    public String getSkuDescribe() {
        return skuDescribe;
    }

    public void setSkuDescribe(String skuDescribe) {
        this.skuDescribe = skuDescribe == null ? null : skuDescribe.trim();
    }

    public Integer getSkuInventory() {
        return skuInventory;
    }

    public void setSkuInventory(Integer skuInventory) {
        this.skuInventory = skuInventory;
    }

    public Integer getSkuRecommend() {
        return skuRecommend;
    }

    public void setSkuRecommend(Integer skuRecommend) {
        this.skuRecommend = skuRecommend;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skuId=").append(skuId);
        sb.append(", skuSpu=").append(skuSpu);
        sb.append(", skuTitle=").append(skuTitle);
        sb.append(", skuPrice=").append(skuPrice);
        sb.append(", skuDescribe=").append(skuDescribe);
        sb.append(", skuInventory=").append(skuInventory);
        sb.append(", skuRecommend=").append(skuRecommend);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}