package com.whjx.controller;

import com.whjx.pojo.Store;
import com.whjx.service.impl.StoreInfomationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreInfomationController {
    @Autowired
    private StoreInfomationServiceImpl storeInfomationService;

    @CrossOrigin
    @RequestMapping(value = "/storeInfo" ,method = {RequestMethod.GET,RequestMethod.POST})
    public Store storeInfomation(){
        return storeInfomationService.storeInfomation();
    }
}
