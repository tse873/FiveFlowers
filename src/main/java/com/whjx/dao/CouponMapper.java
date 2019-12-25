package com.whjx.dao;

import com.whjx.pojo.Coupon;
import java.util.List;

public interface CouponMapper {
    int deleteByPrimaryKey(Integer couponId);

    int insert(Coupon record);

    Coupon selectByPrimaryKey(Integer couponId);

    List<Coupon> selectAll();

    int updateByPrimaryKey(Coupon record);
}