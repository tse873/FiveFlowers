package com.whjx.service.impl;

import com.whjx.dao.SelectSpuMapper;
import com.whjx.pojo.Spu;
import com.whjx.service.SelectSpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectSpuServiceImpl implements SelectSpuService {
    @Autowired
    private SelectSpuMapper selectSpuMapper;
    @Override
    public Spu selectSpu(int id) {
        return selectSpuMapper.selectSpu(id);
    }
}
