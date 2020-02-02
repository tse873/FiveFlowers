package com.whjx.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.whjx.pojo.Kill;
import com.whjx.service.impl.ActiveShopImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activeShop")
public class ActiveShopController {
    private final static Logger log = LoggerFactory.getLogger(ActiveShopController.class);

    @Autowired
    private ActiveShopImpl iActiveShopService;
    @CrossOrigin
    @GetMapping("/selectAll")
    public String selectAll(){
        String res;
        try{
            List<Kill> kills = iActiveShopService.selectAll();
            ObjectMapper objectMapper = new ObjectMapper();
            res = objectMapper.writeValueAsString(kills);
        }catch (Exception e){
            log.error("查询秒杀商品出现异常",e.fillInStackTrace());
            return "error";
        }
        return res;
    }

    @CrossOrigin
    @PostMapping("/insert")
    public String insertKill(@RequestBody Kill kill){
        String res = "新增失败,已有该秒杀商品";
        try {
            int i = iActiveShopService.insertKill(kill);
            if (i > 0){
                res = "新增成功";
            }
        }catch (Exception e){
            log.error("新增活动商品出现异常",e.fillInStackTrace());
        }
        return res;
    }

    @CrossOrigin
    @RequestMapping(value = "/upaSpu",method = {RequestMethod.GET,RequestMethod.POST})
    public String updSpu(Kill kill){
        String res = "";
        try {
            int i = iActiveShopService.updSpu(kill);
            if(i > 0) {
                res = "操作成功";
            } else{
                res = "操作异常";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       return res;
    }

    @CrossOrigin
    @RequestMapping(value = "/delSpu",method = {RequestMethod.GET,RequestMethod.POST})
    public String delSpu(int killId){
        int i = iActiveShopService.delSpu(killId);
        if(i > 0){
            return "操作成功";
        }else {
            return "操作异常";
        }
    }
}
