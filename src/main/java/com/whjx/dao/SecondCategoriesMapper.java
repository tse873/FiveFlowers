package com.whjx.dao;

import com.whjx.pojo.SecondCategories;
import java.util.List;

public interface SecondCategoriesMapper {
    int deleteByPrimaryKey(Integer scId);

    int insert(SecondCategories record);

    SecondCategories selectByPrimaryKey(Integer scId);

    List<SecondCategories> selectAll();

    int updateByPrimaryKey(SecondCategories record);
}