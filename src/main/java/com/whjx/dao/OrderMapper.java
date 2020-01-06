package com.whjx.dao;

import com.whjx.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("om")
public interface OrderMapper {
    List<Order> getOrderAll(Order order);
    Order getOrderByStatus(@Param("ods") int orderDeliveryStatus);

}
