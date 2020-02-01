package com.whjx.controller;

import com.whjx.dto.cartMoneyDto;
import com.whjx.service.impl.ShopCartCountServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Multiple")
public class ShopCartCountCntroller {
    private final static Logger log = LoggerFactory.getLogger(ShopCartCountCntroller.class);

    @Autowired
    private ShopCartCountServiceImpl shopCartCountServiceimpl;
    @CrossOrigin
    @GetMapping(value = "/radio")
    public double getFinalPrice(@RequestParam Integer shopId, Integer count){
        double price = 0;
        try {
            price = shopCartCountServiceimpl.cartMoney(shopId, count);
        }catch (Exception e){
            log.error("单选计算价格时错误",e.fillInStackTrace());
        }

        return price;
    }
    @CrossOrigin
    @PostMapping("/multiple")
    public double getCartMoneys(@RequestBody @Validated List<cartMoneyDto> cmd ){
        double price = 0;
        try {
            price = shopCartCountServiceimpl.crtMoneys(cmd);
        }catch (Exception e){
            log.error("多选计算价格时错误",e.fillInStackTrace());
        }

        return price;
    }
    @CrossOrigin
    @GetMapping(value = "/all")
    public double getAllPrice(@RequestParam String openId){
        double price = 0;
        try {
            price = shopCartCountServiceimpl.cartAllMoneys(openId);
        }catch (Exception e){
            log.error("全选计算价格时错误",e.fillInStackTrace());
        }

        return price;
    }
}
