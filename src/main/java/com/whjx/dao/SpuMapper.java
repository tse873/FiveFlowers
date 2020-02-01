package com.whjx.dao;

import com.whjx.pojo.Spu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpuMapper {
    int updateSpu(@Param("spu") Spu spu);
    int updateState(@Param("spuId") Integer spuId);
    int addSpu(@Param("spu") Spu spu);
    List<Spu> findSpuall();
}
