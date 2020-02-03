package com.whjx.service.impl;

import com.whjx.dao.AddressMapper;
import com.whjx.pojo.Address;
import com.whjx.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("addressse")
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressmr;

    @Override
    public String updateAddress(Integer adId, String adOpenId, Address address) {
        int i = addressmr.updateAddress(adId, adOpenId, address);
        if (i > 0){
            return "订单地址修改成功";
        }else {
            return "订单地址修改失败";
        }
    }
}
