package com.whjx.service.impl;

import com.whjx.dao.OrderInfoMapper;
import com.whjx.pojo.OrderInfo;
import com.whjx.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public int getAddOrderInfo(OrderInfo oi) {
        return orderInfoMapper.getAddOrderInfo(oi);
    }
}
