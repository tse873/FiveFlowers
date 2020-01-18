package com.whjx.dao;

import com.whjx.pojo.Spu;
import org.apache.ibatis.annotations.Param;

public interface SpuDetialMapper {
    Spu selectById(@Param("id") Integer id);
}
