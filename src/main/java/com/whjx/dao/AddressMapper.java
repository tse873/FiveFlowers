package com.whjx.dao;

import com.whjx.pojo.Address;
import java.util.List;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer adId);

    int insert(Address record);

    Address selectByPrimaryKey(Integer adId);

    List<Address> selectAll();

    int updateByPrimaryKey(Address record);
}