package com.whjx.controller;

import com.whjx.pojo.Address;
import com.whjx.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AddressController {
    @Autowired
    private AddressServiceImpl addressse;
    @RequestMapping(value = "/uas",method = RequestMethod.POST)
    public Object updateAddress(Integer adId,String adOpenId,Address address){
        return addressse.updateAddress(adId,adOpenId,address);
    }
}
