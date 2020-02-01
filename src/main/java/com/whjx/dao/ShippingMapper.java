package com.whjx.dao;

import com.whjx.pojo.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingMapper {
    Address selectAddress(@Param("ui") String openId);
}
