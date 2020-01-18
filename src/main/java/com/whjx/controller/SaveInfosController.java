package com.whjx.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.whjx.pojo.UserInfo;
import com.whjx.service.impl.SaveInfosImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaveInfosController {
    @Autowired
    private SaveInfosImpl saveInfos;

    @CrossOrigin
    @RequestMapping(value = "/wxlogin", method = RequestMethod.GET)
    public String decodeUserInfo(@RequestParam String code, String encryptedData, String iv) {
        String userInfo = "";
        try {
            UserInfo users = saveInfos.saveInfos(code, encryptedData, iv);
            ObjectMapper objectMapper = new ObjectMapper();
            userInfo = objectMapper.writeValueAsString(users);
        }catch (Exception e){
            return "error";
        }
        return userInfo;
    }
}