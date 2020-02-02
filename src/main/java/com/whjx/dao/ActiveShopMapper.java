package com.whjx.dao;

import com.whjx.pojo.Kill;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ActiveShopMapper {
    List<Kill> selectAll();
    int insertKill(@Param("kill") Kill kill);
    int updSpu(@Param("Kill") Kill kill);
    int delSpu(@Param("killId") int killId);
}
