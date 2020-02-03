package com.whjx.service.impl;

import com.whjx.dao.AdminInfoMapper;
import com.whjx.pojo.AdminInfo;
import com.whjx.service.AdminInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

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

    @Override
    public List<AdminInfo> selectAllAdmin(){
        return adminInfoMapper.selectAllAdmin();
    }

    @Override
    public String addAdmin(AdminInfo adminInfo) {
        int i = adminInfoMapper.addAdmin(adminInfo);
        if(i > 0){
            return "添加新管理员成功";
        }else{
            return "操作失败";
        }
    }

    @Override
    public String changeStaus(int staus, int adminId) {
        String res = "";
        if(staus >=0 & staus <= 1){
            int i = adminInfoMapper.changeStaus(staus, adminId);
            if(i > 0){
                if(staus == 1){
                    res = "启动该账号成功";
                }else if(staus == 0){
                    res = "关闭该账号成功";
                }
            } else {
                res = "启用失败";
            }
        }else{
            res = "异常";

        }
        return res;
    }
}
