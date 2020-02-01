package com.whjx.dao;

import com.whjx.pojo.Spu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectSpuMapper {
    Spu selectSpu(@Param("id") int id);
}
