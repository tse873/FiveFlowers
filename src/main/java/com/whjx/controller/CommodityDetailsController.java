package com.whjx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whjx.pojo.SecondCategories;
import com.whjx.pojo.Spu;
import com.whjx.service.impl.CommodityDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CommodityDetailsController {
    @Autowired
    private CommodityDetailsServiceImpl cdsi;

    public void setCdsi(CommodityDetailsServiceImpl cdsi) {
        this.cdsi = cdsi;
    }

    @Autowired
    private RedisTemplate redisTemplate;


    @CrossOrigin
    @RequestMapping(value = "/details",method = {RequestMethod.GET,RequestMethod.POST})
    public PageInfo<Spu> getSpuById(int spuId,int page,int pageSize){
        PageHelper.startPage(page + 1,pageSize);
        List<Spu> s = cdsi.getSpuById(spuId);
        PageInfo miracle = new PageInfo(s);
        redisTemplate.opsForValue().set("miracle",miracle);
        return miracle;

    }
}
