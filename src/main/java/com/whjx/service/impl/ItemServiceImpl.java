package com.whjx.service.impl;

import com.whjx.dao.KillMapper;
import com.whjx.pojo.Img;
import com.whjx.pojo.Kill;
import com.whjx.service.IItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements IItemService {
    private static final Logger log = LoggerFactory.getLogger(ItemServiceImpl.class);
    @Autowired
    private KillMapper killMapper;
    /**
     *获取待秒杀商品
     * @return
     * @throws Exception
     */
    @Override
    public List<Kill> getKillItems() throws Exception {
        killMapper.updateCanKill();
        List<Kill> kills = killMapper.selectAll();
//        PageHelper.startPage(1, 8);
//        PageInfo<User>  p = new PageInfo<>(list);
//        list=p.getList();
        return kills;
    }

    /**
     * 获取秒杀商品详情
     * @return
     * @throws Exception
     */
    @Override
    public Kill getKilldetail(Integer id) throws Exception {
//        Map<String ,String> map = null;
//        killMapper.updateCanKill();
        Kill kill = killMapper.selectById(id);
        if (kill == null){
            throw new Exception("暂无此秒杀商品记录");
        }
        return kill;
    }
}
