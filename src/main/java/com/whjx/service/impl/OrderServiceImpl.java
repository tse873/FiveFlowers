package com.whjx.service.impl;

import com.whjx.dao.OrderMapper;
import com.whjx.pojo.Order;
import com.whjx.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("osi")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper om;
    @Override
    public List<Order> getOrderAll(Order order) {
        return om.getOrderAll(order);
    }

    @Override
    public Order getOrderByStatus(int orderDeliveryStatus) {
        return om.getOrderByStatus(orderDeliveryStatus);
    }
}
