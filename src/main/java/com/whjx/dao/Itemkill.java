package com.whjx.dao;

import com.whjx.pojo.KillSuccess;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository

public interface Itemkill{
    @Transactional

    @Select("SELECT COUNT(1) AS total FROM w_kill_success WHERE kill_id = #{killId} AND user_id = #{userId}  AND `kill_status` in(0)")
    Integer countByKillUserId (@Param("killId") Integer killId, @Param("userId") Integer userId);

    @Update("UPDATE w_kill SET kill_count = kill_count-1 WHERE kill_spuid = #{killId} AND kill_count > 0 ")
    Integer updateKillCount(@Param("killId") Integer KillId);



}
