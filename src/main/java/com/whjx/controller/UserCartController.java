package com.whjx.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.whjx.pojo.ShopCart;
import com.whjx.service.impl.UserCartServiceImpl;
import com.whjx.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserCartController {
    @Autowired
    private UserCartServiceImpl userCartServiceImpl;

    @CrossOrigin
    @RequestMapping(value = "/selectCarts",method = {RequestMethod.POST,RequestMethod.GET})
    public String selectAll(@RequestParam int userid) {
        if (userid < 1){
            return "购物车是空的";
        }
        String shopCartJson;
        List<ShopCart> shopCarts = userCartServiceImpl.selectAll(userid);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            shopCartJson = objectMapper.writeValueAsString(shopCarts);
            return shopCartJson;
        } catch (Exception e) {
            return "获取购物车列表异常";
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/addToCart",method = {RequestMethod.POST,RequestMethod.GET})
    public String addToCarts(ShopCart shopcart){
        String s = "";
        try {
            String res = userCartServiceImpl.addToCart(shopcart);
            ObjectMapper objectMapper = new ObjectMapper();
            s = objectMapper.writeValueAsString(res);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return s;
    }

    @CrossOrigin
    @RequestMapping(value = "/updateNum",method = {RequestMethod.POST,RequestMethod.GET})
    public String updateCart(int userId,ShopCart sc){
        String s = "";
        try {
            String res = userCartServiceImpl.updateCart(userId,sc.getShopcartSkuId(),sc.getShopcartNumber());
            ObjectMapper objectMapper = new ObjectMapper();
            s = objectMapper.writeValueAsString(res);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return s;
    }

    @CrossOrigin
    @RequestMapping(value = "/delete",method = {RequestMethod.POST,RequestMethod.GET})
    public String deleteShop(int userId,int skuId){
        String s = "";
        int count = userCartServiceImpl.deleteShop(userId, skuId);
        if(count > 0){
            return "";
        } else{
            try {
                String res = "暂无此商品";
                ObjectMapper objectMapper = new ObjectMapper();
                s = objectMapper.writeValueAsString(res);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return s;
        }
    }
}