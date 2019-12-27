package com.whjx.service.impl;

import com.whjx.dao.HomeShopDisplayMapper;
import com.whjx.pojo.Spu;
import com.whjx.service.HomeShopDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("HomeShopDisplayServiceImpl")
public class HomeShopDisplayServiceImpl implements HomeShopDisplayService {
    @Autowired
    private HomeShopDisplayMapper homeShopDisplayMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<Spu> selectAllByPrimaryCategories(int pcid) {
        return homeShopDisplayMapper.selectAllByPrimaryCategories(pcid);
    }
}