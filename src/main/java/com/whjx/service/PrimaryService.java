package com.whjx.service;

import com.whjx.pojo.SecondCategories;

import java.util.List;

public interface PrimaryService {
    List<SecondCategories> selectPrimaryShow(int scPc);
}
