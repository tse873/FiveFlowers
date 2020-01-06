package com.whjx.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.whjx.pojo.Carousel;
import com.whjx.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
public class CarouselController {
    @Autowired
    private CarouselService cs;
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Object find(int id){
        Carousel alls = cs.findAll(id);
        if (alls.getCarouselIsshow() == 1){
            if (alls.getCarouselUrl()!=null){
                String photos = alls.getCarouselUrl();
                List<String> list = Arrays.asList(photos.split(","));
                alls.setCarouselUrls(list);
            }
            String s = "";
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                s = objectMapper.writeValueAsString(alls);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return s;
        }
       return null;
    }
}
