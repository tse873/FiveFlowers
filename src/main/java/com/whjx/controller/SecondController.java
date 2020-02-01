package com.whjx.controller;

import com.whjx.pojo.Spu;
import com.whjx.service.impl.SecondServiceImpl;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        for (Spu spus : s) {
            String key = "spus";
            key = key + spus.getId();
            Map<String,String> value = new HashedMap();
            Class cs = Spu.class;
            Field[] arrays = cs.getDeclaredFields();
            for (Field field : arrays) {
                String fieldName = field.getName();
                String getter = "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
                try {
                    Method get = cs.getMethod(getter);
                    String fieldValue = get.invoke(spus) + "";
                    value.put(fieldName,fieldValue);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Jedis jedis = new Jedis();
            jedis.hmset(key,value);
        }
        return s;
    }
}
