package com.whjx.controller;

import com.whjx.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StandardController {
    @Autowired
    private StandardService standards;
    @CrossOrigin
    @RequestMapping(value = "/ssbi",method = RequestMethod.GET)
    public Object standardSpuById(int id){
         return standards.standardById(id);
    }
}
