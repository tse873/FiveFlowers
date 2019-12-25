package com.whjx.pojo;

import java.io.Serializable;
import java.util.Date;

public class Collect implements Serializable {
    private Integer collectId;

    private Integer collectUserid;

    private Integer collectSpuid;

    private Date collectTime;

    private static final long serialVersionUID = 1L;

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getCollectUserid() {
        return collectUserid;
    }

    public void setCollectUserid(Integer collectUserid) {
        this.collectUserid = collectUserid;
    }

    public Integer getCollectSpuid() {
        return collectSpuid;
    }

    public void setCollectSpuid(Integer collectSpuid) {
        this.collectSpuid = collectSpuid;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collectId=").append(collectId);
        sb.append(", collectUserid=").append(collectUserid);
        sb.append(", collectSpuid=").append(collectSpuid);
        sb.append(", collectTime=").append(collectTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}