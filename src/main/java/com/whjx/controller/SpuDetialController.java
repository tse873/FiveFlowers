package com.whjx.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.whjx.pojo.Spu;
import com.whjx.service.impl.SpuDetialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpuDetialController {
    @Autowired
    private SpuDetialServiceImpl spuDetialService;
    @CrossOrigin
    @GetMapping("/spuDetial")
    public String SpuDetial(Integer id) {
        String spuDetial = "";
        try {
           Spu spu = spuDetialService.selectByShopId(id);
            ObjectMapper objectMapper = new ObjectMapper();
            spuDetial = objectMapper.writeValueAsString(spu);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return spuDetial;
    }
}
