package com.whjx.service;

import com.whjx.pojo.UserInfo;

public interface ISaveInfoService {
    UserInfo saveInfos(String code, String encryptedData, String iv);
}
