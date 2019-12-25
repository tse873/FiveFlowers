package com.whjx.dao;

import com.whjx.pojo.Kill;
import java.util.List;

public interface KillMapper {
    int deleteByPrimaryKey(Integer killId);

    int insert(Kill record);

    Kill selectByPrimaryKey(Integer killId);

    List<Kill> selectAll();

    int updateByPrimaryKey(Kill record);
}