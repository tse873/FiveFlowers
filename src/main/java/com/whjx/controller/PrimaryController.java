package com.whjx.controller;

import com.whjx.pojo.SecondCategories;
import com.whjx.service.impl.PrimaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 二级分类
 */
@RestController
public class PrimaryController {
    @Autowired
    private PrimaryServiceImpl psi;

        @CrossOrigin
        @RequestMapping(value = "/show",method = {RequestMethod.GET,RequestMethod.POST})
    public List<SecondCategories> selectPrimaryShow(Integer scPc){

        List<SecondCategories> pc = psi.selectPrimaryShow(scPc);
        return pc;
}









}
