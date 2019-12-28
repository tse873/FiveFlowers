package com.whjx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whjx.pojo.SecondCategories;
import com.whjx.service.impl.SecondServiceImpl;
import net.sf.jsqlparser.schema.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SecondController {
    @Autowired
    private SecondServiceImpl ssi;
    @Autowired
    private RedisTemplate redisTemplate;

    public void setSsi(SecondServiceImpl ssi) {
        this.ssi = ssi;
    }


    @CrossOrigin
    @RequestMapping(value = "/show",method = {RequestMethod.GET,RequestMethod.POST})
    public PageInfo<SecondCategories> selectSecondShow(Integer scId, int page, int pageSize){
        PageHelper.startPage(page + 1,pageSize);
        List<SecondCategories> sc = ssi.selectSecondShow(scId);
        PageInfo pageInfo = new PageInfo(sc);
        redisTemplate.opsForValue().set("pageInfo",pageInfo);
        return pageInfo;

}









}
