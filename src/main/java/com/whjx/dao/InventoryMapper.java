package com.whjx.dao;

import com.whjx.pojo.Inventory;
import java.util.List;

public interface InventoryMapper {
    int deleteByPrimaryKey(Integer inventoryId);

    int insert(Inventory record);

    Inventory selectByPrimaryKey(Integer inventoryId);

    List<Inventory> selectAll();

    int updateByPrimaryKey(Inventory record);
}