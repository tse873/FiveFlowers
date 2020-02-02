package com.whjx.dao;

import com.whjx.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ManageOrderMapper {
    List<Order> selectAll();
    int delOrder(@Param("orderId") String orderId);
}
