package com.whjx.dao;

import com.whjx.pojo.CatData;
import java.util.List;

public interface CatDataMapper {
    int deleteByPrimaryKey(Integer catDataid);

    int insert(CatData record);

    CatData selectByPrimaryKey(Integer catDataid);

    List<CatData> selectAll();

    int updateByPrimaryKey(CatData record);
}