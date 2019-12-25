package com.whjx.pojo;

import java.io.Serializable;
import java.util.Date;

public class Store implements Serializable {
    private Integer storeId;

    private String storeName;

    private String storeLogo;

    private Date storeCreatetime;

    private String storeAddress;

    private String storePhone;

    private String storeIntroduction;

    private static final long serialVersionUID = 1L;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreLogo() {
        return storeLogo;
    }

    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo == null ? null : storeLogo.trim();
    }

    public Date getStoreCreatetime() {
        return storeCreatetime;
    }

    public void setStoreCreatetime(Date storeCreatetime) {
        this.storeCreatetime = storeCreatetime;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone == null ? null : storePhone.trim();
    }

    public String getStoreIntroduction() {
        return storeIntroduction;
    }

    public void setStoreIntroduction(String storeIntroduction) {
        this.storeIntroduction = storeIntroduction == null ? null : storeIntroduction.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", storeId=").append(storeId);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeLogo=").append(storeLogo);
        sb.append(", storeCreatetime=").append(storeCreatetime);
        sb.append(", storeAddress=").append(storeAddress);
        sb.append(", storePhone=").append(storePhone);
        sb.append(", storeIntroduction=").append(storeIntroduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}