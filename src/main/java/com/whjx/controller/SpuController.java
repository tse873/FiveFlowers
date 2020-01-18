package com.whjx.controller;

import com.whjx.pojo.Spu;
import com.whjx.service.impl.SpuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/spu",method = {RequestMethod.GET,RequestMethod.POST})
public class SpuController {

    @Autowired
    private SpuServiceImpl ssi;

    @CrossOrigin
    @PutMapping("updatespu")
    public String updateSpus(Spu spu){
        return ssi.updateSpu(spu);
    }

    @CrossOrigin
    @PostMapping("addspu")
    public String addSpus(Spu spu){
        return ssi.addSpu(spu);
    }

    @CrossOrigin
    @GetMapping("findall")
    public List<Spu> findSpualls(){
        return ssi.findSpuall();
    }
}