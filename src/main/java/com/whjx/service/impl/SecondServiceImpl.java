package com.whjx.service.impl;


import com.whjx.dao.ISecondMapper;
import com.whjx.pojo.SecondCategories;

import com.whjx.service.ISecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ssi")
public class SecondServiceImpl implements ISecondService {
    @Autowired
    private ISecondMapper isd;

    public void setIsd(ISecondMapper isd) {
        this.isd = isd;
    }


    @Override
    public List<SecondCategories> selectSecondShow(int scId) {
        return isd.selectSecondShow(scId);
    }
}
