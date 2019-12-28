package com.whjx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whjx.pojo.SecondCategories;
import com.whjx.service.impl.SecondServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SecondController {
    @Autowired
    private SecondServiceImpl ssi;

    public void setSsi(SecondServiceImpl ssi) {
        this.ssi = ssi;
    }
    @CrossOrigin
    @RequestMapping(value = "/show",method = {RequestMethod.GET,RequestMethod.POST})
    public PageInfo<SecondCategories> selectSecondShow(Integer scId, int page, int pageSize){
        PageHelper.startPage(page + 1,pageSize);
        List<SecondCategories> sc = ssi.selectSecondShow(scId);
        PageInfo pageInfo = new PageInfo(sc);
        return pageInfo;
}
}
