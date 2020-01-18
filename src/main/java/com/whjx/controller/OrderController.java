package com.whjx.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whjx.pojo.Order;
import com.whjx.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderServiceImpl osi;
    @CrossOrigin
    @RequestMapping(value = "/orderall",method = RequestMethod.GET)
    public PageInfo<Order> orderAll(int page,int pageSize,Order order){
        PageHelper.startPage(page + 1,pageSize);
        List<Order> orderAll = osi.getOrderAll(order);
        PageInfo pageInfo = new PageInfo(orderAll);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValueAsString(order);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return pageInfo;
    }
    @CrossOrigin
    @RequestMapping(value = "/bystatus",method = RequestMethod.GET)
    public Object orderByStatus(int status){
        return osi.getOrderByStatus(status);
    }
    @CrossOrigin
    @RequestMapping(value = "/updateobs",method = RequestMethod.PUT)
    public Object updateOrderByStatus(Order order){
        return osi.updateOrderByStatus(order);
    }
}
