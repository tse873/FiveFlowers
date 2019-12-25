package com.whjx.dao;

import com.whjx.pojo.ReturnMoney;
import java.util.List;

public interface ReturnMoneyMapper {
    int deleteByPrimaryKey(Integer returnMoneyId);

    int insert(ReturnMoney record);

    ReturnMoney selectByPrimaryKey(Integer returnMoneyId);

    List<ReturnMoney> selectAll();

    int updateByPrimaryKey(ReturnMoney record);
}