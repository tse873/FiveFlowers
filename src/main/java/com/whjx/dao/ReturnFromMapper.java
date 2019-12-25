package com.whjx.dao;

import com.whjx.pojo.ReturnFrom;
import java.util.List;

public interface ReturnFromMapper {
    int deleteByPrimaryKey(Integer returnId);

    int insert(ReturnFrom record);

    ReturnFrom selectByPrimaryKey(Integer returnId);

    List<ReturnFrom> selectAll();

    int updateByPrimaryKey(ReturnFrom record);
}