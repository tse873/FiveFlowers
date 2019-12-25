package com.whjx.dao;

import com.whjx.pojo.Express;
import java.util.List;

public interface ExpressMapper {
    int deleteByPrimaryKey(Integer expressId);

    int insert(Express record);

    Express selectByPrimaryKey(Integer expressId);

    List<Express> selectAll();

    int updateByPrimaryKey(Express record);
}