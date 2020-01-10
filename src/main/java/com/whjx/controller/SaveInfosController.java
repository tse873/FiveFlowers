package com.whjx.controller;

import com.whjx.service.impl.SaveInfosImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaveInfosController {
    @Autowired
    private SaveInfosImpl saveInfos;

    @CrossOrigin
    @RequestMapping(value = "/wxlogin", method = RequestMethod.GET)
    public String decodeUserInfo(@RequestParam String code,String encryptedData, String iv) {
        return saveInfos.saveInfos(code,encryptedData,iv);
    }
}