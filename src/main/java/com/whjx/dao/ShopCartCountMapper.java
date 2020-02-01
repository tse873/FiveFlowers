package com.whjx.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopCartCountMapper {
    double selectMoneyByShopId(@Param("shopId") Integer shopId);
    List<Integer> selectSpuId(@Param("openId") String openId);
    Integer selectCount(@Param("spuId") Integer spuId);
}
