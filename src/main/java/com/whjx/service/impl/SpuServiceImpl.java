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
        s.setSpu_title(spu.getSpu_title());
        s.setSpu_state(spu.getSpu_state());
        s.setSpu_addtime(spu.getSpu_addtime());
        s.setSpu_sc(spu.getSpu_sc());
        s.setSpu_describe(spu.getSpu_describe());
        s.setSpu_specification(spu.getSpu_specification());
        s.setSpu_recommend(spu.getSpu_recommend());
        s.setSpu_img_url(spu.getSpu_img_url());
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