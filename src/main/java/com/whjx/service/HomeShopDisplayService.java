package com.whjx.service;

import com.github.pagehelper.Page;
import com.whjx.pojo.Spu;

import java.util.List;

public interface HomeShopDisplayService {
    List<Spu> selectAllByPrimaryCategories(int pcid);
}
