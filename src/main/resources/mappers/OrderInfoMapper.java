package com.whjx.dao;

import com.whjx.pojo.OrderInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OrderInfoMapper extends Mapper<OrderInfo> {
    @Insert("insert into w_orderinfo values (#{oi.oiDetailsId},#{oi.orOrderId},#{oi.orderGoodsId},#{oi.goodsName},#{oi.goodsCount},#{oi.goodsPrice},#{oi.totalFee})")
    int getAddOrderInfo(@Param("oi") OrderInfo oi);
}
