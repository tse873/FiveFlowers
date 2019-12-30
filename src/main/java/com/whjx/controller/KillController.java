package com.whjx.controller;

import com.whjx.dto.KillDto;
import com.whjx.enums.StatusCode;
import com.whjx.response.BaseResponse;
import com.whjx.service.impl.KillServiceImpl;
import com.whjx.util.SnowFlake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

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
    public BaseResponse execute(@RequestBody @Validated KillDto dto, BindingResult result, HttpSession session){
//        如果传入的参数有误或id小于0返回前端新的响应状态码
        if (result.hasErrors() || dto.getKillId() <= 0){
            return new BaseResponse(StatusCode.InvalidParams);
        }
        BaseResponse response = new BaseResponse(StatusCode.Success);
        try {
            boolean res = killService.killItem(dto.getKillId(), dto.getUserId());
            if ( res == false){
                return new BaseResponse(StatusCode.Fail);
            }
        }catch (Exception e){
            response = new BaseResponse(StatusCode.Fail.getCode(),e.getMessage());
        }
        return response;
    }

}
