package com.whjx.dto;

import lombok.Data;

@Data
public class cartMoneyDto {
    private Integer shopId;

    public Integer getShopId() {
        return shopId;
    }

    public double getCount() {
        return count;
    }

    private double count;
}
