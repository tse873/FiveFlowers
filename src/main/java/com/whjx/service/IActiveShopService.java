package com.whjx.service;

import com.whjx.pojo.Kill;
import java.util.List;

public interface IActiveShopService {
    List<Kill> selectAll();
    int insertKill(Kill kill);
    int updSpu(Kill kill)throws Exception;
    int delSpu(int killId);
}
