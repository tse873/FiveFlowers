package com.whjx.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.whjx.pojo.Carousel;
import com.whjx.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
public class CarouselController {
    @Autowired
    private CarouselService cs;
    @RequestMapping(value = "/finds",method = RequestMethod.GET)
    public Object finds(Carousel carousel){
        List<Carousel> alls = cs.findAlls(carousel);
        if (alls!=null){
                for (int i=0;i<alls.size();i++){
                    if (alls.get(i).getCarouselUrl()!=null){
                        String photos = alls.get(i).getCarouselUrl();
                        List<String> list = Arrays.asList(photos.split(","));
                        alls.get(i).setCarouselUrls(list);
                    }
                }
            }
            return alls;
    }
}
