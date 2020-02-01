package com.whjx.service.impl;

import com.whjx.dao.ShopCartCountMapper;
import com.whjx.dto.cartMoneyDto;
import com.whjx.service.ShopCartCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCartCountServiceImpl implements ShopCartCountService {
    @Autowired
    private ShopCartCountMapper shopCartCountMapper;
    @Override
    public double cartMoney(Integer shopId,Integer count)throws Exception {
        double price = shopCartCountMapper.selectMoneyByShopId(shopId);
        double finalPrice = price * count;
        return finalPrice;
    }

    @Override
    public double crtMoneys(List<cartMoneyDto> cmd) {
        double finalPrice = 0;
        for (cartMoneyDto cart : cmd) {
            double price = shopCartCountMapper.selectMoneyByShopId(cart.getShopId());
            finalPrice = price * cart.getCount() + finalPrice;

        }
        return finalPrice;
    }

    @Override
    public double cartAllMoneys(String openId) {
        double finalPrice = 0;
        List<Integer> spuIdList = shopCartCountMapper.selectSpuId(openId);
        for (Integer spuId: spuIdList) {
            double shopPrice = shopCartCountMapper.selectMoneyByShopId(spuId);
            Integer count = shopCartCountMapper.selectCount(spuId);
            finalPrice = shopPrice * count + finalPrice;
        }
        return finalPrice;
    }
}
