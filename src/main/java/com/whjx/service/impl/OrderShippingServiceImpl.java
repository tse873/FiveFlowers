package com.whjx.service.impl;

import com.whjx.dao.OrderShippingMapper;
import com.whjx.pojo.OrderShipping;
import com.whjx.service.OrderShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderShippingServiceImpl implements OrderShippingService {
    @Autowired
    private OrderShippingMapper orderShippingMapper;

    @Override
    public int createShipping(OrderShipping os) {
        return orderShippingMapper.createShipping(os);
    }
}
