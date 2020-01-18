package com.whjx.dao;

import com.whjx.pojo.Spu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondMapper {
    List<Spu> selectSecond(@Param("sc") int spuSc);
}
