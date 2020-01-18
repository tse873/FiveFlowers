package com.whjx.controller;

import com.whjx.pojo.PrimaryCategories;
import com.whjx.service.impl.FirstServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 一级分类
 */
@RestController
public class FirstController {
    @Autowired
    private FirstServiceImpl fsi;

    @CrossOrigin
    @RequestMapping(value = "/first",method = {RequestMethod.GET,RequestMethod.POST})
    public List<PrimaryCategories> selectFirst(){
        List<PrimaryCategories> p = fsi.selectFirst();
        return p;
    }
}
