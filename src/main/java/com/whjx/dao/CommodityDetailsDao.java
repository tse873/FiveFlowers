package com.whjx.dao;

import com.whjx.pojo.Sku;
import com.whjx.pojo.Spu;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("cdd")
public interface CommodityDetailsDao {
    List<Spu> getSpuById(int spuId);


}
