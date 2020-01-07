package com.whjx.dao;

import com.whjx.pojo.ShopCart;
import com.whjx.pojo.Sku;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserCartMapper {
    List<ShopCart> selectAll(@Param("id") int userId);
    int addToCart(@Param("sc") ShopCart shopcart);
    int updateCart(@Param("userId") int userId, @Param("skuId") int skuId, @Param("num") int num);
    int deleteShop(@Param("userid") int userId, @Param("skuid") int skuId);
    Sku findSkuById(@Param("kid") int skuId);
}
