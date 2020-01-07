package com.whjx.controller;

import com.whjx.dto.KillDto;
import com.whjx.enums.StatusCode;
import com.whjx.response.BaseResponse;
import com.whjx.service.impl.KillServiceImpl;
import com.whjx.util.SnowFlake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
//    public BaseResponse execute(@RequestBody @Validated KillDto dto, BindingResult result, HttpSession session){
////        如果传入的参数有误或id小于0返回前端新的响应状态码
//        if (result.hasErrors() || dto.getKillId() <= 0){
//            return new BaseResponse(StatusCode.InvalidParams);
//        }
//        BaseResponse response = new BaseResponse(StatusCode.Success);
//        try {
//            boolean res = killService.killItemV5(dto.getKillId(), dto.getUserId());
//            if ( res == false){
//                return new BaseResponse(StatusCode.Fail);
//            }
//        }catch (Exception e){
//            response = new BaseResponse(StatusCode.Fail.getCode(),e.getMessage());
//        }
//        return response;
//    }
//
//
//
//    /***
//     * 商品秒杀核心业务逻辑-用于压力测试
//     * @param dto
//     * @param result
//     * @return
//     */
//    @RequestMapping(value = "/execute/lock",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public BaseResponse executeLock(@RequestBody @Validated KillDto dto, BindingResult result){
        if (result.hasErrors() || dto.getKillId()<=0){
            return new BaseResponse(StatusCode.InvalidParams);
        }
        BaseResponse response=new BaseResponse(StatusCode.Success);
        try {
            //不加分布式锁的前提
            /*Boolean res=killService.killItemV2(dto.getKillId(),dto.getUserId());
            if (!res){
                return new BaseResponse(StatusCode.Fail.getCode(),"不加分布式锁-哈哈~商品已抢购完毕或者不在抢购时间段哦!");
            }*/

            //基于Redis的分布式锁进行控制
            /*Boolean res=killService.killItemV3(dto.getKillId(),dto.getUserId());
            if (!res){
                return new BaseResponse(StatusCode.Fail.getCode(),"基于Redis的分布式锁进行控制-哈哈~商品已抢购完毕或者不在抢购时间段哦!");
            }*/

            //基于Redisson的分布式锁进行控制
            /*Boolean res=killService.killItemV4(dto.getKillId(),dto.getUserId());
            if (!res){
                return new BaseResponse(StatusCode.Fail.getCode(),"基于Redisson的分布式锁进行控制-哈哈~商品已抢购完毕或者不在抢购时间段哦!");
            }*/

            //基于ZooKeeper的分布式锁进行控制
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
