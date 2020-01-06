package com.whjx.controller;

import com.whjx.pojo.Spu;
import com.whjx.service.SolrSpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SolrSpuController {
    @Autowired
    private SolrSpuService sss;
    @RequestMapping("/commit")
    public List<Spu> commitAll(){
        List<Spu> all =sss.commitAll();
        return all;
    }

}
