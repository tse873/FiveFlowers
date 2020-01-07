package com.whjx.dao;

import com.whjx.pojo.Img;
import com.whjx.pojo.Kill;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


public interface KillMapper {



    @Update("UPDATE w_kill SET can_kill = (CASE WHEN (NOW() BETWEEN kill_start AND kill_end AND kill_count > 0) THEN 1 ELSE 0  END)")
    int updateCanKill();
    // @Select("SELECT a.kill_id,  a.kill_spuid, a.kill_price,  a.kill_isactive, b.spu_id, b.spu_title, b.spu_state,  b.spu_describe, b.spu_img_url,  (CASE WHEN (NOW() BETWEEN a.kill_start AND a.kill_end AND a.kill_count > 0) THEN 1 ELSE 0 END ) AS canKill  FROM w_kill AS a LEFT JOIN w_spu AS b ON b.spu_id = a.kill_spuid WHERE a.kill_isactive = 1;")
    List<Kill> selectAll();

    //    @Select("SELECT a.kill_id, a.kill_count, a.kill_start, a.kill_end, a.kill_spuid,  a.kill_price, a.kill_isactive, b.spu_id,  b.spu_title, b.spu_state,  b.spu_sc, b.spu_describe, img.img_url, img.img_sort, img.img_main,  img.img_spu_id, (CASE WHEN (NOW() BETWEEN a.kill_start AND a.kill_end AND a.kill_count > 0) THEN 1 ELSE 0  END) AS canKill FROM (w_kill AS a LEFT JOIN w_spu AS b ON b.spu_id = a.kill_spuid) LEFT JOIN w_img AS img ON b.spu_id = img.img_spu_id WHERE a.kill_isactive = 1 AND a.kill_spuid = #{killId}")
    Kill selectById(@Param("killId") Integer killId);

    int selectByUserId(@Param("userId") Integer userId);


}