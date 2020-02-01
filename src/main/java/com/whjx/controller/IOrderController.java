package com.whjx.controller;

import com.whjx.pojo.*;
import com.whjx.service.impl.*;
import com.whjx.util.E3Result;
import com.whjx.util.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 订单
 */
@RestController
public class IOrderController {
    @Autowired
    private ShippingServiceImpl ssi;
    @Autowired
    private SelectSpuServiceImpl sssi;
    @Autowired
    private IOrderServiceImpl osi;
    @Autowired
    private OrderInfoServiceImpl oisi;
    @Autowired
    private OrderShippingServiceImpl ossi;
    private SnowFlake snowFlake = new SnowFlake(2, 3);

    @RequestMapping(value = "/createOrder",method = {RequestMethod.POST})
    public E3Result createOrder(Integer id, String openId, Integer num) {

        Order order = new Order();
        OrderInfo orderInfo = new OrderInfo();
        OrderShipping orderShipping = new OrderShipping();
        Spu spu = sssi.selectSpu(id);
        Address ad = ssi.selectAddress(openId);
        String orderId = String.valueOf(snowFlake.nextId());
        order.setOrderId(orderId);
        order.setStatus(0);
        order.setPaymentType(1);
        order.setOpenId(openId);
        order.setCreateTime(new Date());
        order.setUpdateTime(new Date());
        order.setPayment(spu.getSpuPrice() * num);
        orderInfo.setGoodsCount(num);
        orderInfo.setGoodsName(spu.getSpuTitle());
        orderInfo.setGoodsPrice(spu.getSpuPrice());
        orderInfo.setOrderGoodsId(id);
        orderInfo.setOrOrderId(orderId);
        orderInfo.setTotalFee(spu.getSpuPrice() * num);
        String OiDetailsId = String.valueOf(snowFlake.nextId());
        orderInfo.setOiDetailsId(OiDetailsId);
        oisi.getAddOrderInfo(orderInfo);
        orderShipping.setOrderId(orderId);
        orderShipping.setReceiverName(ad.getAdName());
        orderShipping.setReceiverPhone(ad.getAdTel());
        orderShipping.setReceiverState(ad.getAdProvince());
        orderShipping.setReceiverCity(ad.getAdCity());
        orderShipping.setReceiverDistrict(ad.getAdDistrict());
        orderShipping.setReceiverAddress(ad.getAdSite());
        ossi.createShipping(orderShipping);
        osi.createOrder(order);
        return E3Result.ok(orderId);
    }
}

