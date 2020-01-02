package com.whjx.service.impl;

import com.whjx.dao.CommodityDetailsDao;
import com.whjx.pojo.Spu;
import com.whjx.service.CommodityDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("cdsi")
public class CommodityDetailsServiceImpl implements CommodityDetailsService {
    @Autowired
    private CommodityDetailsDao cdd;

    public void setCdd(CommodityDetailsDao cdd) {
        this.cdd = cdd;
    }

    @Override
    public List<Spu> getSpuById(int spuId) {
        return cdd.getSpuById(spuId);
    }
}
