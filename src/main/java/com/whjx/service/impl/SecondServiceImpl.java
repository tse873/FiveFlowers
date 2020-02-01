package com.whjx.service.impl;

import com.whjx.dao.SecondMapper;
import com.whjx.pojo.Spu;
import com.whjx.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SecondServiceImpl implements SecondService {
    @Autowired
    private SecondMapper sm;
    @Override
    public List<Spu> selectSecond(int spuSc) {
        return sm.selectSecond(spuSc);
    }
}