package com.whjx.service.impl;

import com.whjx.dao.ShippingMapper;
import com.whjx.pojo.Address;
import com.whjx.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingServiceImpl implements ShippingService {
    @Autowired
    private ShippingMapper shippingMapper;
    @Override
    public Address selectAddress(String openId) {
        return shippingMapper.selectAddress(openId);
    }
}
