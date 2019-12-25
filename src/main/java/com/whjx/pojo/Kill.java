package com.whjx.pojo;

import java.io.Serializable;
import java.util.Date;

public class Kill implements Serializable {
    private Integer killId;

    private Integer killCount;

    private Date killStart;

    private Date killEnd;

    private Integer killSkuid;

    private Long killPrice;

    private static final long serialVersionUID = 1L;

    public Integer getKillId() {
        return killId;
    }

    public void setKillId(Integer killId) {
        this.killId = killId;
    }

    public Integer getKillCount() {
        return killCount;
    }

    public void setKillCount(Integer killCount) {
        this.killCount = killCount;
    }

    public Date getKillStart() {
        return killStart;
    }

    public void setKillStart(Date killStart) {
        this.killStart = killStart;
    }

    public Date getKillEnd() {
        return killEnd;
    }

    public void setKillEnd(Date killEnd) {
        this.killEnd = killEnd;
    }

    public Integer getKillSkuid() {
        return killSkuid;
    }

    public void setKillSkuid(Integer killSkuid) {
        this.killSkuid = killSkuid;
    }

    public Long getKillPrice() {
        return killPrice;
    }

    public void setKillPrice(Long killPrice) {
        this.killPrice = killPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", killId=").append(killId);
        sb.append(", killCount=").append(killCount);
        sb.append(", killStart=").append(killStart);
        sb.append(", killEnd=").append(killEnd);
        sb.append(", killSkuid=").append(killSkuid);
        sb.append(", killPrice=").append(killPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}