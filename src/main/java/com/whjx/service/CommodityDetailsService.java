package com.whjx.service;

import com.whjx.pojo.Spu;

import java.util.List;

public interface CommodityDetailsService {
    List<Spu> getSpuById(int spuId);
}
