package com.whjx.service;

import com.whjx.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrderAll(Order order);
    Order getOrderByStatus(int status);
    String updateOrderByStatus(Order order);
}
