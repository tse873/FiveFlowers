package com.whjx.dao;

import com.whjx.pojo.PrimaryCategories;
import java.util.List;

public interface PrimaryCategoriesMapper {
    int deleteByPrimaryKey(Integer pcId);

    int insert(PrimaryCategories record);

    PrimaryCategories selectByPrimaryKey(Integer pcId);

    List<PrimaryCategories> selectAll();

    int updateByPrimaryKey(PrimaryCategories record);
}