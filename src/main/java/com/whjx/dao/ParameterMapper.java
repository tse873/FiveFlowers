package com.whjx.dao;

import com.whjx.pojo.Parameter;
import java.util.List;

public interface ParameterMapper {
    int deleteByPrimaryKey(Integer parameterId);

    int insert(Parameter record);

    Parameter selectByPrimaryKey(Integer parameterId);

    List<Parameter> selectAll();

    int updateByPrimaryKey(Parameter record);
}