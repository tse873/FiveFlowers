package com.whjx.service.impl;

import com.whjx.dao.AdminInfoMapper;
import com.whjx.pojo.AdminInfo;
import com.whjx.service.AdminInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("AdminInfoServiceImpl")
public class AdminInfoServiceImpl implements AdminInfoService {
    @Autowired
    private AdminInfoMapper adminInfoMapper;

    @Override
    public AdminInfo adminLogin(AdminInfo adminInfo) {
        return adminInfoMapper.adminLogin(adminInfo.getAdminName(),adminInfo.getAdminPassword());
    }

    @Override
    public AdminInfo findAdminByName(String username) {
        return adminInfoMapper.findAdminByName(username);
    }
}
