package com.whjx.dao;

import com.whjx.pojo.ShopCart;
import java.util.List;

public interface ShopCartMapper {
    int deleteByPrimaryKey(Integer shopcartId);

    int insert(ShopCart record);

    ShopCart selectByPrimaryKey(Integer shopcartId);

    List<ShopCart> selectAll();

    int updateByPrimaryKey(ShopCart record);
}