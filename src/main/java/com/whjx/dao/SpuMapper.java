package com.whjx.dao;

import com.whjx.pojo.Spu;
import java.util.List;

public interface SpuMapper {
    int deleteByPrimaryKey(Integer spuId);

    int insert(Spu record);

    Spu selectByPrimaryKey(Integer spuId);

    List<Spu> selectAll();

    int updateByPrimaryKey(Spu record);
}