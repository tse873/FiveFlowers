package com.whjx.dao;

import com.whjx.pojo.Cat;
import java.util.List;

public interface CatMapper {
    int deleteByPrimaryKey(Integer catId);

    int insert(Cat record);

    Cat selectByPrimaryKey(Integer catId);

    List<Cat> selectAll();

    int updateByPrimaryKey(Cat record);
}