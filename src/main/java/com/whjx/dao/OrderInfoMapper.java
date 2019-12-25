package com.whjx.dao;

import com.whjx.pojo.OrderInfo;
import java.util.List;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer oiDetailsId);

    int insert(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer oiDetailsId);

    List<OrderInfo> selectAll();

    int updateByPrimaryKey(OrderInfo record);
}