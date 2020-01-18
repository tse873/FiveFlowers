package com.whjx.service.impl;

import com.whjx.dao.FirstMapper;
import com.whjx.pojo.PrimaryCategories;
import com.whjx.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstServiceImpl implements FirstService {
    @Autowired
    private FirstMapper fm;

    @Override
    public List<PrimaryCategories> selectFirst() {
        return fm.selectFirst();
    }
}
