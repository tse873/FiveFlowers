package com.whjx.service;

import com.whjx.pojo.Img;
import com.whjx.pojo.PrimaryCategories;
import com.whjx.pojo.Spu;
import java.util.List;

public interface HomeShopDisplayService {
    List<Spu> selectAllByPrimaryCategories(int pcid);
    List<Spu> selectAllRecommend();
    List<PrimaryCategories> selectAll();
    List<Img> selectImg();
}
