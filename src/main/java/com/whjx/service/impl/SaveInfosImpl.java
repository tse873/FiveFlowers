package com.whjx.service.impl;

import com.whjx.config.WeChatConfig;
import com.whjx.dao.SaveInfoMapper;
import com.whjx.pojo.UserInfo;
import com.whjx.service.ISaveInfoService;
import com.whjx.util.AesCbcUtil;
import com.whjx.util.HttpRequestUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveInfosImpl implements ISaveInfoService {

    @Autowired
    private SaveInfoMapper sim;

    @Override
    public UserInfo saveInfos(String code,String encryptedData, String iv) {
        UserInfo u = null;
        if (code == null || code.length() == 0) {
            return u;
        }
        String wxspAppid = WeChatConfig.APPID;
        String wxspSecret = WeChatConfig.APP_SECRECT;
        String grant_type = WeChatConfig.AUTHORIZATION_CODE;
        String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type=" + grant_type;
        String sr = HttpRequestUtil.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        JSONObject json = JSONObject.fromObject(sr);
        String session_key = json.get("session_key").toString();
        String openid = (String) json.get("openid");
        if (null != sim.selectUser(openid) && openid.equals(sim.selectUser(openid).getOpenid())){
            return sim.selectUser(openid);
        } else {
            try {
                String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "UTF-8");
                if (null != result && result.length() > 0) {
                    UserInfo userInfo = new UserInfo();
                    JSONObject userInfoJSON = JSONObject.fromObject(result);
                    userInfo.setOpenid(userInfoJSON.getString("openId"));
                    userInfo.setNickName(userInfoJSON.getString("nickName"));
                    userInfo.setGender( userInfoJSON.getInt("gender"));
                    userInfo.setCity(userInfoJSON.getString("city"));
                    userInfo.setProvince(userInfoJSON.getString("province"));
                    userInfo.setCountry(userInfoJSON.getString("country"));
                    userInfo.setAvatarUrl(userInfoJSON.getString("avatarUrl"));
                    userInfo.setLanguage(userInfoJSON.getString("language"));
                    int i = sim.saveInfo(userInfo);
                    if (i > 0){
                       return userInfo;
                    } else {
                        return u;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return u;
    }
}
