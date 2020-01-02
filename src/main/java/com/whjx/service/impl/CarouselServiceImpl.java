package com.whjx.service.impl;

import com.whjx.dao.CarouselMapper;
import com.whjx.pojo.Carousel;
import com.whjx.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("cs")
public class CarouselServiceImpl implements CarouselService {
    @Autowired
    private CarouselMapper cm;
    @Override
    public Carousel findAll(int id) {
        return cm.findAll(id);
    }
}
