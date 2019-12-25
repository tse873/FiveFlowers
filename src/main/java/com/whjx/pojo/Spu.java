package com.whjx.pojo;

import java.io.Serializable;
import java.util.Date;

public class Spu implements Serializable {
    private Integer spuId;

    private String spuTitle;

    private String spuSontitle;

    private Integer spuState;

    private Date spuAddtime;

    private Integer spuPc;

    private Integer spuSc;

    private String spuDescribe;

    private String spuSpecification;

    private Integer spuRecommend;

    private static final long serialVersionUID = 1L;

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public String getSpuTitle() {
        return spuTitle;
    }

    public void setSpuTitle(String spuTitle) {
        this.spuTitle = spuTitle == null ? null : spuTitle.trim();
    }

    public String getSpuSontitle() {
        return spuSontitle;
    }

    public void setSpuSontitle(String spuSontitle) {
        this.spuSontitle = spuSontitle == null ? null : spuSontitle.trim();
    }

    public Integer getSpuState() {
        return spuState;
    }

    public void setSpuState(Integer spuState) {
        this.spuState = spuState;
    }

    public Date getSpuAddtime() {
        return spuAddtime;
    }

    public void setSpuAddtime(Date spuAddtime) {
        this.spuAddtime = spuAddtime;
    }

    public Integer getSpuPc() {
        return spuPc;
    }

    public void setSpuPc(Integer spuPc) {
        this.spuPc = spuPc;
    }

    public Integer getSpuSc() {
        return spuSc;
    }

    public void setSpuSc(Integer spuSc) {
        this.spuSc = spuSc;
    }

    public String getSpuDescribe() {
        return spuDescribe;
    }

    public void setSpuDescribe(String spuDescribe) {
        this.spuDescribe = spuDescribe == null ? null : spuDescribe.trim();
    }

    public String getSpuSpecification() {
        return spuSpecification;
    }

    public void setSpuSpecification(String spuSpecification) {
        this.spuSpecification = spuSpecification == null ? null : spuSpecification.trim();
    }

    public Integer getSpuRecommend() {
        return spuRecommend;
    }

    public void setSpuRecommend(Integer spuRecommend) {
        this.spuRecommend = spuRecommend;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spuId=").append(spuId);
        sb.append(", spuTitle=").append(spuTitle);
        sb.append(", spuSontitle=").append(spuSontitle);
        sb.append(", spuState=").append(spuState);
        sb.append(", spuAddtime=").append(spuAddtime);
        sb.append(", spuPc=").append(spuPc);
        sb.append(", spuSc=").append(spuSc);
        sb.append(", spuDescribe=").append(spuDescribe);
        sb.append(", spuSpecification=").append(spuSpecification);
        sb.append(", spuRecommend=").append(spuRecommend);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}