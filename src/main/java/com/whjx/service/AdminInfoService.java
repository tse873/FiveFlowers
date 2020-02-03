package com.whjx.service;

import com.whjx.pojo.AdminInfo;
import java.util.List;

public interface AdminInfoService {
    AdminInfo adminLogin(AdminInfo adminInfo);
    AdminInfo findAdminByName(String username);
    List<AdminInfo> selectAllAdmin();
    String addAdmin(AdminInfo adminInfo);
    String changeStaus(int staus,int adminId);
}
