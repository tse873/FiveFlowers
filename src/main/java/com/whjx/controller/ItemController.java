package com.whjx.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.whjx.pojo.Kill;
import com.whjx.service.impl.ItemServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 待秒杀商品controller
 * @author 张晓
 * @Data: 2019/12/27
 */
@RestController
@RequestMapping("/item")
@ResponseBody
public class ItemController {
//    将itemcontroller放到springioc容器中
    private static final Logger log = LoggerFactory.getLogger(ItemController.class);
//    设置请求前缀
    private static final String prefix = "item";
    @Autowired
    private ItemServiceImpl itemService;
    /**
     * 获取商品列表
     */

    @CrossOrigin
    @RequestMapping(value = "/listShow",method = RequestMethod.GET)
    public String list(ModelMap modelMap){
        String killJson;
        try{
            List<Kill> killItems = itemService.getKillItems();
            ObjectMapper objectMapper = new ObjectMapper();
            killJson = objectMapper.writeValueAsString(killItems);
//            objectMapper.writeValueAsString(imgs);
        }catch (Exception e){
            log.error("获取待秒杀商品列表出现异常",e.fillInStackTrace());
            return "error";
        }
        return killJson;
    }

    /**
     * 获取秒杀商品详情
     * @param id
     * @return
     */
    @CrossOrigin
    @GetMapping(value = "/detail")
    public String detail(@RequestParam Integer id){
        String shopdetail;
        if (id == 0 || id < 0){
            return "error";
        }
        try {
            Kill killdetail = itemService.getKilldetail(id);
            ObjectMapper objectMapper = new ObjectMapper();
            shopdetail = objectMapper.writeValueAsString(killdetail);
        }catch (Exception e){
            log.error("详情页出错",id,e.fillInStackTrace());
            return "error";
        }
        return shopdetail;
    }
}
