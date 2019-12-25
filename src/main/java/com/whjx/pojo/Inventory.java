package com.whjx.pojo;

import java.io.Serializable;

public class Inventory implements Serializable {
    private Integer inventoryId;

    private Integer inventoryCount;

    private Integer inventoryShop;

    private static final long serialVersionUID = 1L;

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Integer getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(Integer inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public Integer getInventoryShop() {
        return inventoryShop;
    }

    public void setInventoryShop(Integer inventoryShop) {
        this.inventoryShop = inventoryShop;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inventoryId=").append(inventoryId);
        sb.append(", inventoryCount=").append(inventoryCount);
        sb.append(", inventoryShop=").append(inventoryShop);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}