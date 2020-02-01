package com.whjx.pojo;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "order_shipping")
public class OrderShipping  {
    private String orderId;
    private String receiverName;
    private String receiverPhone;
    private String receiverMobile;
    private String receiverState;
    private String receiverCity;
    private String receiverDistrict;
    private String receiverAddress;
}
