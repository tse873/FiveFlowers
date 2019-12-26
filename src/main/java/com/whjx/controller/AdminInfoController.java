package com.whjx.controller;

import com.alibaba.fastjson.JSONObject;
import com.whjx.annotation.AdminLoginToken;
import com.whjx.pojo.AdminInfo;
import com.whjx.service.impl.AdminInfoServiceImpl;
import com.whjx.service.impl.TokenService;
import com.whjx.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class AdminInfoController {
    @Autowired
    private AdminInfoServiceImpl adminInfoServiceImpl;
    @Autowired
    private TokenService tokenService;

    @CrossOrigin
    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public Object login(AdminInfo adminInfo, HttpServletResponse response){
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
    @AdminLoginToken
    @RequestMapping(value = "/getMessage" ,method = RequestMethod.POST)
    public String getMessage() {

        if (TokenUtil.getTokenUserName() != null){
            return "您已通过验证";
        }else {
            return "没有token信息,您未登录";
        }
    }
}