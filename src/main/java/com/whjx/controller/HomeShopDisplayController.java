package com.whjx.controller;

import com.whjx.pojo.Spu;
import com.whjx.service.impl.HomeShopDisplayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeShopDisplayController {
    @Autowired
    private HomeShopDisplayServiceImpl homeShopDisplayServiceImpl;

    @CrossOrigin
    @RequestMapping(value = "/homeshop",method = {RequestMethod.GET,RequestMethod.POST})
    public List<Spu> sselectAllByPrimaryCategories(int pcid){
        return homeShopDisplayServiceImpl.selectAllByPrimaryCategories(pcid);
    }
}