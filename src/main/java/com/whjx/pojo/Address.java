package com.whjx.pojo;

import java.io.Serializable;

public class Address implements Serializable {
    private Integer adId;

    private Integer adProvince;

    private Integer adCity;

    private Integer adDistrict;

    private String adSite;

    private String adName;

    private String adTel;

    private Integer adUserId;

    private Integer adIsdefault;

    private static final long serialVersionUID = 1L;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getAdProvince() {
        return adProvince;
    }

    public void setAdProvince(Integer adProvince) {
        this.adProvince = adProvince;
    }

    public Integer getAdCity() {
        return adCity;
    }

    public void setAdCity(Integer adCity) {
        this.adCity = adCity;
    }

    public Integer getAdDistrict() {
        return adDistrict;
    }

    public void setAdDistrict(Integer adDistrict) {
        this.adDistrict = adDistrict;
    }

    public String getAdSite() {
        return adSite;
    }

    public void setAdSite(String adSite) {
        this.adSite = adSite == null ? null : adSite.trim();
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public String getAdTel() {
        return adTel;
    }

    public void setAdTel(String adTel) {
        this.adTel = adTel == null ? null : adTel.trim();
    }

    public Integer getAdUserId() {
        return adUserId;
    }

    public void setAdUserId(Integer adUserId) {
        this.adUserId = adUserId;
    }

    public Integer getAdIsdefault() {
        return adIsdefault;
    }

    public void setAdIsdefault(Integer adIsdefault) {
        this.adIsdefault = adIsdefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adId=").append(adId);
        sb.append(", adProvince=").append(adProvince);
        sb.append(", adCity=").append(adCity);
        sb.append(", adDistrict=").append(adDistrict);
        sb.append(", adSite=").append(adSite);
        sb.append(", adName=").append(adName);
        sb.append(", adTel=").append(adTel);
        sb.append(", adUserId=").append(adUserId);
        sb.append(", adIsdefault=").append(adIsdefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}