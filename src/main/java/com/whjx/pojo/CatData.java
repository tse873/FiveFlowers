package com.whjx.pojo;

import java.io.Serializable;

public class CatData implements Serializable {
    private Integer catDataid;

    private Integer catCatid;

    private String catDataname;

    private static final long serialVersionUID = 1L;

    public Integer getCatDataid() {
        return catDataid;
    }

    public void setCatDataid(Integer catDataid) {
        this.catDataid = catDataid;
    }

    public Integer getCatCatid() {
        return catCatid;
    }

    public void setCatCatid(Integer catCatid) {
        this.catCatid = catCatid;
    }

    public String getCatDataname() {
        return catDataname;
    }

    public void setCatDataname(String catDataname) {
        this.catDataname = catDataname == null ? null : catDataname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catDataid=").append(catDataid);
        sb.append(", catCatid=").append(catCatid);
        sb.append(", catDataname=").append(catDataname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}