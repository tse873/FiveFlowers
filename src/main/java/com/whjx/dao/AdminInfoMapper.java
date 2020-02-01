package com.whjx.dao;

import com.whjx.pojo.AdminInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("AdminInfoMapper")
public interface AdminInfoMapper {
    AdminInfo adminLogin (@Param("username") String username, @Param("password") String password);
    AdminInfo findAdminByName(@Param("username") String username);
}
