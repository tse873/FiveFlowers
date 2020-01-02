package com.whjx.controller;

import com.whjx.pojo.Carousel;
import com.whjx.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CarouselController {
    @Autowired
    private CarouselService cs;
    @RequestMapping("/find")
    public Object find(int id){
        Carousel alls = cs.findAll(id);
        if (alls.getCarouselIsshow() == 1){
            if (alls.getCarouselUrl()!=null){
                String photos = alls.getCarouselUrl();
                List<String> list = Arrays.asList(photos.split(","));
                alls.setCarouselUrls(list);
            }
            return alls;
        }
       return null;
    }
}
