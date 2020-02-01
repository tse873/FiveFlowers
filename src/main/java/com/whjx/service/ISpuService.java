package com.whjx.service;

import com.whjx.pojo.Spu;

import java.util.List;

public interface ISpuService {
    String updateSpu(Spu spu);
    String updateState(Integer spuId);
    String addSpu(Spu spu);
    List<Spu> findSpuall();
}
