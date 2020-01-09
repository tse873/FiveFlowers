package com.whjx.service;

import com.whjx.pojo.Spu;
import java.util.List;

public interface HomeShopDisplayService {
    List<Spu> selectAllByPrimaryCategories(int pcid);
    List<Spu> selectAllRecommend();
}
