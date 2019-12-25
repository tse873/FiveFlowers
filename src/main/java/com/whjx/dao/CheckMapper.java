package com.whjx.dao;

import com.whjx.pojo.Check;
import java.util.List;

public interface CheckMapper {
    int deleteByPrimaryKey(Integer checkId);

    int insert(Check record);

    Check selectByPrimaryKey(Integer checkId);

    List<Check> selectAll();

    int updateByPrimaryKey(Check record);
}