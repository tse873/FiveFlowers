package com.whjx.service;

import com.whjx.dto.cartMoneyDto;

import java.util.List;

public interface ShopCartCountService {
    double cartMoney(Integer shopId, Integer count)throws Exception;
    double crtMoneys(List<cartMoneyDto> cmd);
    double cartAllMoneys(String openId);
}
