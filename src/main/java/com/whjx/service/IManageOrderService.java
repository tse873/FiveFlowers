package com.whjx.service;

import com.whjx.pojo.Order;
import java.util.List;

public interface IManageOrderService {
    List<Order> selectAll() throws Exception;
    int delOrder(String OrderInfo) throws Exception;
}
