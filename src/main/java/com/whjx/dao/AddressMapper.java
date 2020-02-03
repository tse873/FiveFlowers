package com.whjx.dao;

import com.whjx.pojo.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("addressmr")
public interface AddressMapper {
    int updateAddress(@Param("adId") Integer adId, @Param("adOpenId") String adOpenId, @Param("address") Address address);
}
