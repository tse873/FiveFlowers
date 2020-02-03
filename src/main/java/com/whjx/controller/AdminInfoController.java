package com.whjx.controller;

import com.alibaba.fastjson.JSONObject;
import com.whjx.pojo.AdminInfo;
import com.whjx.service.impl.AdminInfoServiceImpl;
import com.whjx.service.impl.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class AdminInfoController {
    @Autowired
    private AdminInfoServiceImpl adminInfoServiceImpl;
    @Autowired
    private TokenService tokenService;

    @CrossOrigin
    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public Object login(@RequestBody AdminInfo adminInfo, HttpServletResponse response){
        JSONObject jsonObject = new JSONObject();
        AdminInfo ai = adminInfoServiceImpl.adminLogin(adminInfo);
        if (ai == null || !ai.getAdminName().equals(adminInfo.getAdminName()) || !ai.getAdminPassword().equals(adminInfo.getAdminPassword())) {
            jsonObject.put("message", "登录失败,账号或密码错误");
            return jsonObject;
        }else {
            String token = tokenService.getToken(adminInfo);
            jsonObject.put("token", token);
            Cookie cookie = new Cookie("token", token);
            cookie.setPath("/");
            response.addCookie(cookie);
            return jsonObject;
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/allAdmin",method = {RequestMethod.POST,RequestMethod.GET})
    public List<AdminInfo> selectAllAdmin(){
        return adminInfoServiceImpl.selectAllAdmin();
    }

    @CrossOrigin
    @RequestMapping(value = "/addAdmin",method = {RequestMethod.POST})
    public String addAdmin(@RequestBody AdminInfo adminInfo){
        return adminInfoServiceImpl.addAdmin(adminInfo);
    }

    @CrossOrigin
    @RequestMapping(value = "/changeStaus",method = {RequestMethod.POST})
    public String changeStaus(int staus,int adminId){
        return adminInfoServiceImpl.changeStaus(staus,adminId);
    }
}