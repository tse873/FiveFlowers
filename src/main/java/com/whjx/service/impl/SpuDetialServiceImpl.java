package com.whjx.service.impl;

import com.whjx.dao.SpuDetialMapper;
import com.whjx.pojo.Spu;
import com.whjx.service.SpuDetialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpuDetialServiceImpl implements SpuDetialService {
    @Autowired
    private SpuDetialMapper spuDetialMapper;
    @Override
    public Spu selectByShopId(Integer id) throws Exception {
        Spu spu = spuDetialMapper.selectById(id);
        return spu;
    }
}
