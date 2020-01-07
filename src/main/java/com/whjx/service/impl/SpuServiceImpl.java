package com.whjx.service.impl;

import com.whjx.dao.SpuMapper;
import com.whjx.pojo.Spu;
import com.whjx.service.ISpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class SpuServiceImpl implements ISpuService {
    @Autowired
    private SpuMapper sm;
    @Override
    public String updateSpu(Spu spu) {
        int i = sm.updateSpu(spu);
        if (i > 0) {
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @Override
    public String addSpu(Spu spu) {
        Spu s = new Spu();
        s.setId(spu.getId());
        s.setSpuTitle(spu.getSpuTitle());
        s.setSpuState(spu.getSpuState());
        s.setSpuAddtime(spu.getSpuAddtime());
        s.setSpuSc(spu.getSpuSc());
        s.setSpuDescribe(spu.getSpuDescribe());
        s.setSpuSpecification(spu.getSpuSpecification());
        s.setSpuRecommend(spu.getSpuRecommend());
        s.setSpuImgUrl(spu.getSpuImgUrl());
        int i = sm.addSpu(s);
        if (i > 0) {
            return "添加成功";
        }else {
            return "添加失败";
        }
    }

    @Override
    public List<Spu> findSpuall() {
        return sm.findSpuall();
    }

}