package com.whjx.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.whjx.pojo.Order;
import com.whjx.service.impl.ManagerOrderImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/managerOrder")
public class ManagerOrderController {
    private static final Logger log = LoggerFactory.getLogger(ManagerOrderController.class);

    @Autowired
    private ManagerOrderImpl managerOrder;

    @CrossOrigin
    @GetMapping("/selectAll")
    public String selectAll(){
        String res;
        try{
            List<Order> orders = managerOrder.selectAll();
            ObjectMapper objectMapper = new ObjectMapper();
            res = objectMapper.writeValueAsString(orders);
        }catch (Exception e){
            log.error("查询订单出现异常",e.fillInStackTrace());
            return "error";
        }
        return res;
    }

    @CrossOrigin
    @GetMapping("/delOrder")
    public String delOrder(@RequestParam String orderId){
        String res = "删除失败,暂无此订单";
        try {
            int i = managerOrder.delOrder(orderId);
            if (i > 0){
                res = "删除成功";
            }
        }catch (Exception e){
            log.error("删除订单出现异常",e.fillInStackTrace());
        }
        return res;
    }
}
