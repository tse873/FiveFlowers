package com.whjx.service.impl;

import com.whjx.dao.UserCartMapper;
import com.whjx.pojo.ShopCart;
import com.whjx.pojo.Spu;
import com.whjx.service.UserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("UserCartServiceImpl")
public class UserCartServiceImpl implements UserCartService {
    @Autowired
    private UserCartMapper userCartMapper;

    @Override
    public List<ShopCart> selectAll(String openId) {
        return userCartMapper.selectAll(openId);
    }

    @Override
    public String addToCart(ShopCart shopcart) {
        String res = "";
        if(userCartMapper.selectAll(shopcart.getShopcartOpenId()).size() != 0) {
            for (ShopCart shopCart : userCartMapper.selectAll(shopcart.getShopcartOpenId())) {
                if(shopCart.getShopcartSpuId() == shopcart.getShopcartSpuId() & userCartMapper.findSpuById(shopcart.getShopcartSpuId()).getSpuInventory() < shopcart.getShopcartNumber()) {
                    res = "数量超出库存了";
                } else if(shopCart.getShopcartSpuId() == shopcart.getShopcartSpuId() & (shopcart.getShopcartNumber() + shopCart.getShopcartNumber()) > userCartMapper.findSpuById(shopcart.getShopcartSpuId()).getSpuInventory()){
                    res = "商品加购件数(含已加购件数)已超过库存";
                } else if(shopCart.getShopcartSpuId() == shopcart.getShopcartSpuId()){
                    shopcart.setShopcartNumber(shopcart.getShopcartNumber() + shopCart.getShopcartNumber());
                    userCartMapper.deleteShop(shopCart.getShopcartOpenId(), shopCart.getShopcartSpuId());
                    res = String.valueOf(userCartMapper.addToCart(shopcart));
                } else {
                    if(userCartMapper.findSpuById(shopcart.getShopcartSpuId()).getSpuInventory() < shopcart.getShopcartNumber()){
                        res = "数量超出范围了";
                    }else{
                        userCartMapper.deleteShop(shopcart.getShopcartOpenId(), shopcart.getShopcartSpuId());
                        res = String.valueOf(userCartMapper.addToCart(shopcart));
                    }
                }
            }
        }else {
            Spu spu = userCartMapper.findSpuById(shopcart.getShopcartSpuId());
            if(spu != null && spu.getSpuInventory() < (shopcart.getShopcartNumber())){
                res = "数量超出范围了";
            }else{
                res = String.valueOf(userCartMapper.addToCart(shopcart));
            }
        }
        return res;
    }

    @Override
    public String updateCart (ShopCart shopcart){
        String res = "";
        List<ShopCart> shopCarts = userCartMapper.selectAll(shopcart.getShopcartOpenId());
        if(shopCarts != null) {
            for (ShopCart shopCart : shopCarts) {
                if (shopcart.getShopcartNumber() < 1) {
                    res = "数量不能少于1件";
                } else if (shopcart.getShopcartNumber() > shopCart.getSpu().getSpuInventory()) {
                    res = "数量超出范围";
                } else {
                    int count = userCartMapper.updateCart(shopcart);
                    if (count == 0) {
                        res = "修改失败";
                    } else {
                        res = "修改成功";
                    }
                }
            }
        }
        return res;
    }

    @Override
    public int deleteShop (String openId, int spuId){
       int count = 0;
        for (ShopCart res: userCartMapper.selectAll(openId)){
            if(res.getShopcartSpuId() == spuId) {
                count = userCartMapper.deleteShop(openId,spuId);
            }
        }
        return count;
    }
}