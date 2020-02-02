package com.whjx.service.impl;

import com.whjx.dao.ActiveShopMapper;
import com.whjx.pojo.Kill;
import com.whjx.service.IActiveShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
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
    public int updSpu(Kill kill) throws Exception{
        Kill killSpu = new Kill();
        SimpleDateFormat sdf = new SimpleDateFormat(" yyyy-MM-dd HH:mm:ss ");
        String killStart = sdf.format(kill.getKillStart());
        String killEnd = sdf.format(kill.getKillEnd());
        Date killStartTime = sdf.parse( killStart );
        Date killEndTime = sdf.parse(killEnd);
        System.out.println(killStartTime);
        killSpu.setKillId(kill.getKillId());
        killSpu.setKillCount(kill.getKillCount());
        killSpu.setKillStart(killStartTime);
        killSpu.setKillEnd(killEndTime);
        killSpu.setKillSpuid(kill.getKillSpuid());
        killSpu.setKillPrice(kill.getKillPrice());
        killSpu.setKillIsactive(kill.getKillIsactive());
        kill.setCanKill(kill.getCanKill());
        System.out.println(killSpu);
        return activeShopMapper.updSpu(killSpu);
    }

    public int delSpu(int killId) {
        return activeShopMapper.delSpu(killId);
    }
}
