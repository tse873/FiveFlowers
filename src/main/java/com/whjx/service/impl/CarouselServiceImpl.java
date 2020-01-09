package com.whjx.service.impl;

import com.whjx.dao.CarouselMapper;
import com.whjx.pojo.Carousel;
import com.whjx.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("cs")
public class CarouselServiceImpl implements CarouselService {
    @Autowired
    private CarouselMapper cm;
    @Override
    public List<Carousel> findAlls(Carousel carousel) {
        return cm.findAlls(carousel);
    }


}
