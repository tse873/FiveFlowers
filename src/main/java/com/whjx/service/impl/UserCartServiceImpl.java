package com.whjx.service.impl;

import com.whjx.dao.UserCartMapper;
import com.whjx.pojo.ShopCart;
import com.whjx.pojo.Sku;
import com.whjx.service.UserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("UserCartServiceImpl")
public class UserCartServiceImpl implements UserCartService {
    @Autowired
    private UserCartMapper userCartMapper;

    @Override
    public List<ShopCart> selectAll(int userid) {
        return userCartMapper.selectAll(userid);
    }

    @Override
    public String addToCart(ShopCart shopcart) {
        List<ShopCart> shopcarts = this.selectAll(shopcart.getShopcartUserId());
        if(shopcarts.size() != 0) {
            for (ShopCart shopCart : shopcarts) {
                int kucun = 0;
                for (Sku skuList:shopCart.getSkuList()) {
                    kucun = skuList.getSkuInventory();
                }
                if(kucun < (shopcart.getShopcartNumber()+1)) {
                    return "数量超出范围了";
                } else if(shopcart.getShopcartNumber()+shopCart.getShopcartNumber() > kucun ){
                        return "商品加购件数(含已加购件数)已超过库存";
                } else {
                    shopcart.setShopcartNumber(shopcart.getShopcartNumber() + shopCart.getShopcartNumber());
                    this.deleteShop(shopCart.getShopcartUserId(), shopCart.getShopcartSkuId());
                    return String.valueOf(userCartMapper.addToCart(shopcart));
                }
            }
        } else {
            Sku sku = userCartMapper.findSkuById(shopcart.getShopcartSkuId());
            if(sku.getSkuInventory() < (shopcart.getShopcartNumber() + 1)){
                return "数量超出范围了";
            }else{
                return String.valueOf(userCartMapper.addToCart(shopcart));
            }
        }
        return "异常";
    }

    @Override
    public String updateCart ( int userId, int skuId, int num){
        int kucun = 0;
        for (ShopCart shopCart : this.selectAll(userId)) {
            for (Sku sku : shopCart.getSkuList()) {
                kucun = sku.getSkuInventory();
            }
        }
        if (num < 1) {
            return "数量不能少于1件";
        } else if (num > kucun) {
            return "数量超出范围";
        } else {
            int count = userCartMapper.updateCart(userId, skuId, num);
            if (count == 0) {
                return "修改失败";
            } else {
                return "修改成功";
            }
        }
    }

    @Override
    public int deleteShop (int userId, int skuId){
        int skuid = 0;
        for (ShopCart shopCart : this.selectAll(userId)) {
            skuid = shopCart.getShopcartSkuId();
        }
        if (skuid != skuId) {
            return 0;
        } else {
            return userCartMapper.deleteShop(userId, skuId);
        }
    }
}