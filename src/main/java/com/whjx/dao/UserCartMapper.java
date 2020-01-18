package com.whjx.dao;

import com.whjx.pojo.ShopCart;
import com.whjx.pojo.Spu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserCartMapper {
    List<ShopCart> selectAll(@Param("id") String openid);
    int addToCart(@Param("sc") ShopCart shopcart);
    int updateCart(@Param("shopcart") ShopCart shopcart);
    int deleteShop(@Param("openid") String openid, @Param("spuid") int spuId);
    Spu findSpuById(@Param("pid") int spuId);
}
