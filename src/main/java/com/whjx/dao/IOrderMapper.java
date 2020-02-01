package com.whjx.dao;

import com.whjx.pojo.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderMapper  {

    int createOrder(Order order);


}
