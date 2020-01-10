package com.whjx.service.impl;

import com.whjx.dao.SaveInfoMapper;
import com.whjx.pojo.UserInfo;
import com.whjx.service.ISaveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveInfosImpl implements ISaveInfoService {

    @Autowired
    private SaveInfoMapper sim;

    @Override
    public String saveInfos(UserInfo uis) {
        UserInfo ui = new UserInfo();
        ui.setOpenid(uis.getOpenid());
        ui.setNickName(uis.getNickName());
        ui.setAvatarUrl(uis.getAvatarUrl());
        ui.setGender(uis.getGender());
        ui.setCountry(uis.getCountry());
        ui.setProvince(uis.getProvince());
        ui.setCity(uis.getCity());
        ui.setLanguage(uis.getLanguage());
        final int i = sim.saveInfo(ui);
        if (i > 0){
            return "true";
        }else{
            return "false";
        }
    }
}
