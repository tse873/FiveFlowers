package com.whjx.service;

import com.whjx.pojo.ShopCart;
import java.util.List;

public interface UserCartService {
    List<ShopCart> selectAll(String openId);
    String addToCart(ShopCart shopcart);
    String updateCart(ShopCart shopCart);
    int deleteShop(String openId, int spuId);
}