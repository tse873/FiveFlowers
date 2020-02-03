package com.whjx.dao;

import com.whjx.pojo.AdminInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("AdminInfoMapper")
public interface AdminInfoMapper {
    AdminInfo adminLogin (@Param("username") String username, @Param("password") String password);
    AdminInfo findAdminByName(@Param("username") String username);
    List<AdminInfo> selectAllAdmin();
    int addAdmin(@Param("adminInfo") AdminInfo adminInfo);
    int changeStaus(@Param("staus") int staus,@Param("adminId") int adminId);
}
