package com.whjx.dao;

import com.whjx.pojo.Sku;
import java.util.List;

public interface SkuMapper {
    int deleteByPrimaryKey(Integer skuId);

    int insert(Sku record);

    Sku selectByPrimaryKey(Integer skuId);

    List<Sku> selectAll();

    int updateByPrimaryKey(Sku record);
}