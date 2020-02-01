package com.whjx.service.impl;

import com.whjx.dao.IOrderMapper;
import com.whjx.pojo.Order;
import com.whjx.util.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IOrderServiceImpl implements com.whjx.service.IOrderService {
    @Autowired
    private IOrderMapper orderMapper;

    private SnowFlake snowFlake = new SnowFlake(2, 3);


    @Override
    public void createOrder(Order order) {
       orderMapper.createOrder(order);
    }
}
