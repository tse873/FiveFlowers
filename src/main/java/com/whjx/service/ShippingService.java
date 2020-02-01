package com.whjx.service;

import com.whjx.pojo.Address;

public interface ShippingService {
    Address selectAddress(String openId);
}
