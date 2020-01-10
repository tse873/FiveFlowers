package com.whjx.controller;

import com.whjx.config.WeChatConfig;
import com.whjx.pojo.UserInfo;
import com.whjx.service.impl.SaveInfosImpl;
import com.whjx.util.AesCbcUtil;
import com.whjx.util.HttpRequestUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaveInfosController {
    @Autowired
    private SaveInfosImpl saveInfos;

    @CrossOrigin
    @RequestMapping(value = "/wxlogin", method = RequestMethod.GET)
    public String decodeUserInfo(@RequestParam String code,String encryptedData, String iv) {
        if (code == null || code.length() == 0) {
            return "code 不能为空";
        }
        String wxspAppid = WeChatConfig.APPID;
        String wxspSecret = WeChatConfig.APP_SECRECT;
        String grant_type = WeChatConfig.AUTHORIZATION_CODE;
        String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type=" + grant_type;
        String sr = HttpRequestUtil.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        JSONObject json = JSONObject.fromObject(sr);
        String session_key = json.get("session_key").toString();
        String openid = (String) json.get("openid");
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
                System.out.println(userInfo);
                return saveInfos.saveInfos(userInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}