package com.whjx.dao;

import com.whjx.pojo.Carousel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("cm")
public interface CarouselMapper {
    List<Carousel> findAlls(@Param("csl") Carousel carousel);
}
