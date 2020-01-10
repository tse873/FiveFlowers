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
    String res = "";

    @Override
    public String saveInfos(String code,String encryptedData, String iv) {
        if (code == null || code.length() == 0) {
            res = "无code";
        }
        String wxspAppid = WeChatConfig.APPID;
        String wxspSecret = WeChatConfig.APP_SECRECT;
        String grant_type = WeChatConfig.AUTHORIZATION_CODE;
        String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type=" + grant_type;
        String sr = HttpRequestUtil.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        JSONObject json = JSONObject.fromObject(sr);
        String session_key = json.get("session_key").toString();
        String openid = (String) json.get("openid");
        if (openid.equals(sim.selectUser(openid).getOpenid())){
            res = "登录成功";
        } else{
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
                        res = "success";
                    } else {
                        res = "fail";
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return res;
    }
}
