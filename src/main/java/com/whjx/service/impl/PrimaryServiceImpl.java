package com.whjx.service.impl;



import com.whjx.dao.PrimaryMapper;
import com.whjx.pojo.SecondCategories;
import com.whjx.service.PrimaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrimaryServiceImpl implements PrimaryService {
    @Autowired
    private PrimaryMapper pm;


    @Override
    public List<SecondCategories> selectPrimaryShow(int scPc) {
        return pm.selectPrimaryShow(scPc);
    }
}
