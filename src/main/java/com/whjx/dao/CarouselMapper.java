package com.whjx.dao;

import com.whjx.pojo.Carousel;
import java.util.List;

public interface CarouselMapper {
    int deleteByPrimaryKey(Byte carouselId);

    int insert(Carousel record);

    Carousel selectByPrimaryKey(Byte carouselId);

    List<Carousel> selectAll();

    int updateByPrimaryKey(Carousel record);
}