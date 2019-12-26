package com.whjx.service;

import com.whjx.pojo.AdminInfo;

public interface AdminInfoService {
    AdminInfo adminLogin(AdminInfo adminInfo);
    AdminInfo findAdminByName(String username);
}
