package com.whjx.service.impl;

import com.whjx.dao.ManageOrderMapper;
import com.whjx.pojo.Order;
import com.whjx.service.IManageOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ManagerOrderImpl implements IManageOrderService {

    @Autowired
    private ManageOrderMapper manageOrder;

    @Override
    public List<Order> selectAll() throws Exception {
        List<Order> orders = manageOrder.selectAll();
        return orders;
    }

    @Override
    public int delOrder(String OrderId) throws Exception {
        int res = manageOrder.delOrder(OrderId);
        return res;
    }
}
