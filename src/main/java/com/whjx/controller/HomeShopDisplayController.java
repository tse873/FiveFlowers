package com.whjx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whjx.pojo.Spu;
import com.whjx.service.impl.HomeShopDisplayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeShopDisplayController {
    @Autowired
    private HomeShopDisplayServiceImpl homeShopDisplayServiceImpl;
    @Autowired
    private RedisTemplate redisTemplate;

    @CrossOrigin
    @RequestMapping(value = "/homeshop",method = {RequestMethod.GET,RequestMethod.POST})
    public PageInfo<Spu> selectAllByPrimaryCategories(int pcid,int pageSize, int page){
        PageHelper.startPage(page + 1, pageSize);
        List<Spu> homeshop = homeShopDisplayServiceImpl.selectAllByPrimaryCategories(pcid);
        PageInfo pageInfos = new PageInfo(homeshop);
        redisTemplate.opsForValue().set("pageInfos",pageInfos);
        return pageInfos;
    }

    @CrossOrigin
    @RequestMapping(value = "/goodGoods",method = {RequestMethod.GET,RequestMethod.POST})
    public PageInfo<Spu> selectAllRecommend(int pageSize, int page){
        PageHelper.startPage(page + 1, pageSize);
        List<Spu> spus = homeShopDisplayServiceImpl.selectAllRecommend();
        PageInfo pageInfos = new PageInfo(spus);
        return pageInfos;
    }
}