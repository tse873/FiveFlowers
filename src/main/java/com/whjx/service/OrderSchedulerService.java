package com.whjx.service;

import com.whjx.dao.OrderMapper;
import com.whjx.pojo.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

public class OrderSchedulerService {
    private static final Logger log = LoggerFactory.getLogger(SchedulerService.class);
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private Environment env;
    @Scheduled(cron = "0 0/30 * * * ?")
    public void schedulerOrdersExpir(){
        List<Order> list = orderMapper.orderAll();
        if (list!=null && !list.isEmpty()){
            list.stream().forEach(i -> {
                if (i!=null && i.getDiffTime() > env.getProperty("scheduler.expire.orders.time",Integer.class)){
                   orderMapper.orderExpir(i.getOrderId());
                }
            });
        }
    }
}
