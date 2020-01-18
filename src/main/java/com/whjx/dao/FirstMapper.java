package com.whjx.dao;

import com.whjx.pojo.PrimaryCategories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FirstMapper {
    List<PrimaryCategories> selectFirst();
}
