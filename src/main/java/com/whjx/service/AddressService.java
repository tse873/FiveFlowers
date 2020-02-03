package com.whjx.service;

import com.whjx.pojo.Address;

public interface AddressService {
    String updateAddress(Integer adId, String adOpenId, Address address);
}
