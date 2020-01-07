package com.whjx.dao;

import com.whjx.pojo.KillSuccess;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface KillSuccessMapper {

    KillSuccess selectByOrder(@Param("orderNo") String orderNo);

    int expirOrder(@Param("orderNo") String orderNo);

    @Select("SELECT kill_code,user_id,kill_id,kill_status,creat_time,kill_spu_id FROM w_kill_success,timestampdiff(minute,creat_time,now()) WHERE kill_status = 0")
    List<KillSuccess> selectExpirOrder();

    int countByKillId(@Param("killId") Integer killId,@Param("userId") Integer userId);

    @Insert("INSERT INTO w_kill_success(kill_code,user_id,kill_id,kill_status,creat_time) VALUES(#{killSuccess.killCode},#{killSuccess.userId},#{killSuccess.killId},#{killSuccess.killStatus},#{killSuccess.creatTime})")
    Integer insertKillByKillUserId(@Param("killSuccess") KillSuccess killSuccess);
}
