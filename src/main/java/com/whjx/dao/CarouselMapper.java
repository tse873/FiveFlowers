package com.whjx.dao;

import com.whjx.pojo.Carousel;
import org.springframework.stereotype.Repository;


@Repository("cm")
public interface CarouselMapper {
    Carousel findAll(int id);
}
