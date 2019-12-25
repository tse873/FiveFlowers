package com.whjx.dao;

import com.whjx.pojo.Collect;
import java.util.List;

public interface CollectMapper {
    int deleteByPrimaryKey(Integer collectId);

    int insert(Collect record);

    Collect selectByPrimaryKey(Integer collectId);

    List<Collect> selectAll();

    int updateByPrimaryKey(Collect record);
}