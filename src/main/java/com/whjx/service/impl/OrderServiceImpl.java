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

    @Override
    public String updateOrderByStatus(Order order) {
        int i = om.updateOrderByStatus(order);
        if (i > 0){
            return "更新成功";
        }else {
            return "更新失败";
        }
    }
}
