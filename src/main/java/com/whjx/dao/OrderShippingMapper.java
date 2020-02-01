package com.whjx.dao;

import com.whjx.pojo.OrderShipping;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OrderShippingMapper extends Mapper<OrderShipping> {
    @Insert("insert into order_shipping values (#{os.orderId},#{os.receiverName},#{os.receiverPhone},#{os.receiverMobile},#{os.receiverState},#{os.receiverCity},#{os.receiverDistrict},#{os.receiverAddress})  ")
    int createShipping(@Param("os") OrderShipping os);


}
