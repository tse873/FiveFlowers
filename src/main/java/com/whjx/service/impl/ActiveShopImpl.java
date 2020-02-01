package com.whjx.service.impl;

import com.whjx.dao.ActiveShopMapper;
import com.whjx.pojo.Kill;
import com.whjx.service.IActiveShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActiveShopImpl implements IActiveShopService {
    @Autowired
    private ActiveShopMapper activeShopMapper;

    @Override
    public List<Kill> selectAll(){
        List<Kill> kills = activeShopMapper.selectAll();
        return kills;
    }

    @Override
    public int insertKill(Kill kill) {
        int res = activeShopMapper.insertKill(kill);
        List<Kill> kills = activeShopMapper.selectAll();
        for (Kill shop:kills) {
            if (shop.getKillSpuid() == kill.getKillSpuid()){
                res = 0;
            }
        }
        return res;
    }

    @Override
    public int updSpu(Kill kill) {
        System.out.println(kill.getKillStart());
        return activeShopMapper.updSpu(kill);
    }

    public int delSpu(int killId) {
        return activeShopMapper.delSpu(killId);
    }
}
