package com.whjx.pojo;

import lombok.Data;
import java.util.List;

@Data
public class ShopCart {
    private Integer shopcartUserId;
    private Integer shopcartSkuId;
    private Integer shopcartNumber;
    private List<Sku> skuList;
}
