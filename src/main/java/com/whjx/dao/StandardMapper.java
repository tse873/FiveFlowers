package com.whjx.dao;

import com.whjx.pojo.Spu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("standardm")
public interface StandardMapper {
    List<Spu> standardById(@Param("id") int id);
}
