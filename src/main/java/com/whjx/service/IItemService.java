package com.whjx.service;

import com.whjx.pojo.Kill;

import java.util.List;
import java.util.Map;

public interface IItemService {
    List<Kill> getKillItems() throws Exception;
    Kill getKilldetail(Integer id) throws Exception;
}
