package com.whjx.controller;

import com.whjx.pojo.Spu;
import com.whjx.service.impl.SecondServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品展示
 */
@RestController
public class SecondController {
    @Autowired
    private SecondServiceImpl ssi;
    @CrossOrigin
    @RequestMapping(value = "/second",method = {RequestMethod.GET,RequestMethod.POST})
    public List<Spu> selectSpu(int spuSc){
        List<Spu> s = ssi.selectSecond(spuSc);
        return s;
    }
}
