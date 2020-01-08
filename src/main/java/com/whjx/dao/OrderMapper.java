package com.whjx.dao;

import com.whjx.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("om")
public interface OrderMapper {
    List<Order> getOrderAll(@Param("order") Order order);
    Order getOrderByStatus(@Param("ods") int status);
    int updateOrderByStatus(@Param("orders") Order order);
    int orderExpir(@Param("orderId")String orderId);
    List<Order> orderAll();
}
