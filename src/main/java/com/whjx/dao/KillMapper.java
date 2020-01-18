package com.whjx.dao;

import com.whjx.pojo.Kill;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import java.util.List;

public interface KillMapper {
    @Update("UPDATE w_kill SET can_kill = (CASE WHEN (NOW() BETWEEN kill_start AND kill_end AND kill_count > 0) THEN 1 ELSE 0  END)")
    int updateCanKill();
    List<Kill> selectAll();
    Kill selectById(@Param("killId") Integer killId);
    int selectByOpenId(@Param("openId") String openId);
}