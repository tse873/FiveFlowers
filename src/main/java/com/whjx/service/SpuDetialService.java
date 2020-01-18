package com.whjx.service;

import com.whjx.pojo.Spu;

public interface SpuDetialService {
    Spu selectByShopId(Integer id) throws Exception;
}
