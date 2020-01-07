package com.whjx.service;

import com.whjx.pojo.ShopCart;
import java.util.List;

public interface UserCartService {
    List<ShopCart> selectAll(int userid);
    String addToCart(ShopCart shopcart);
    String updateCart(int userId, int skuId, int num);
    int deleteShop(int userId, int skuId);
}