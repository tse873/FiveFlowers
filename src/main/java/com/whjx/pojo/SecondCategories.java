package com.whjx.pojo;

import java.io.Serializable;

public class SecondCategories implements Serializable {
    private Integer scId;

    private String scName;

    private Integer scPc;

    private static final long serialVersionUID = 1L;

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    public Integer getScPc() {
        return scPc;
    }

    public void setScPc(Integer scPc) {
        this.scPc = scPc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scId=").append(scId);
        sb.append(", scName=").append(scName);
        sb.append(", scPc=").append(scPc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}