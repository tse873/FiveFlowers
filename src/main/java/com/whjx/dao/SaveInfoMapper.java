package com.whjx.dao;

import com.whjx.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveInfoMapper {
    int saveInfo(@Param("ui") UserInfo userInfo);
}
