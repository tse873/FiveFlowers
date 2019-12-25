package com.whjx.dao;

import com.whjx.pojo.Pay;
import java.util.List;

public interface PayMapper {
    int deleteByPrimaryKey(Integer payId);

    int insert(Pay record);

    Pay selectByPrimaryKey(Integer payId);

    List<Pay> selectAll();

    int updateByPrimaryKey(Pay record);
}