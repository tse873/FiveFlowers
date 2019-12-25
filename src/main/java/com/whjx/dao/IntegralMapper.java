package com.whjx.dao;

import com.whjx.pojo.Integral;
import java.util.List;

public interface IntegralMapper {
    int deleteByPrimaryKey(Integer integralId);

    int insert(Integral record);

    Integral selectByPrimaryKey(Integer integralId);

    List<Integral> selectAll();

    int updateByPrimaryKey(Integral record);
}