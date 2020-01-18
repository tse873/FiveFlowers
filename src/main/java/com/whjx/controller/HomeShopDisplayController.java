package com.whjx.controller;

import com.whjx.pojo.Img;
import com.whjx.pojo.PrimaryCategories;
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
    public List<Spu> selectAllByPrimaryCategories(int pcid){
        return homeShopDisplayServiceImpl.selectAllByPrimaryCategories(pcid);
    }

    @CrossOrigin
    @RequestMapping(value = "/goodGoods",method = {RequestMethod.GET,RequestMethod.POST})
    public List<Spu> selectAllRecommend(){
        return homeShopDisplayServiceImpl.selectAllRecommend();
    }

    @CrossOrigin
    @RequestMapping(value = "/PrimaryCategories",method = {RequestMethod.POST,RequestMethod.GET})
    public List<PrimaryCategories>selectAll(){
        return homeShopDisplayServiceImpl.selectAll();
    }

    @CrossOrigin
    @RequestMapping(value = "/indexActivityImg",method = {RequestMethod.POST,RequestMethod.GET})
    public List<Img> selectImg(){
        return homeShopDisplayServiceImpl.selectImg();
    }
}