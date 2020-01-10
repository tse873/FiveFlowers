package com.whjx.controller;

import com.whjx.dto.KillDto;
import com.whjx.enums.StatusCode;
import com.whjx.response.BaseResponse;
import com.whjx.service.impl.KillServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author 张晓
 * @Data: 2019/12/27
 */
@RestController
@RequestMapping("/kill")
public class KillController {
    private final static Logger log = LoggerFactory.getLogger(KillController.class);

    @Autowired
    private KillServiceImpl killService;
/**
 * 商品秒杀核心业务逻辑
 * @param result
 * @param dto
 * @return
 */
@CrossOrigin
@RequestMapping(value = "/isSuccess",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse executeLock(@RequestBody @Validated KillDto dto, BindingResult result){
        if (result.hasErrors() || dto.getKillId()<=0){
            return new BaseResponse(StatusCode.InvalidParams);
        }
        BaseResponse response=new BaseResponse(StatusCode.Success);
        try {
            Boolean res=killService.killItemV5(dto.getKillId(),dto.getUserId());
            if (!res){
                return new BaseResponse(StatusCode.Fail.getCode(),"基于ZooKeeper的分布式锁进行控制-哈哈~商品已抢购完毕或者不在抢购时间段哦!");
            }

        }catch (Exception e){
            response=new BaseResponse(StatusCode.Fail.getCode(),e.getMessage());
        }
        return response;
    }
}