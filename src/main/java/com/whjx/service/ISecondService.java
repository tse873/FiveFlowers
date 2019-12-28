package com.whjx.service;

import com.whjx.pojo.SecondCategories;

import java.util.List;

public interface ISecondService {
    List<SecondCategories> selectSecondShow(int scId);
}
