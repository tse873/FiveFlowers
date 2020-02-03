package com.whjx.service.impl;

import com.whjx.dao.StoreiInfomationMapper;
import com.whjx.pojo.Store;
import com.whjx.service.StoreInfomationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StoreInfomationServiceImpl")
public class StoreInfomationServiceImpl implements StoreInfomationService {
    @Autowired
    private StoreiInfomationMapper storeiInfomationMapper;

    @Override
    public Store storeInfomation() {
        return storeiInfomationMapper.storeInfomation();
    }
}
