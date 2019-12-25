package com.whjx.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer userId;

    private String userOpenid;

    private String userName;

    private String userAvatarurl;

    private String userTruename;

    private Integer userSex;

    private Integer userAge;

    private String userTel;

    private Date userBirthday;

    private Date userCtime;

    private Date userCreattime;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserOpenid() {
        return userOpenid;
    }

    public void setUserOpenid(String userOpenid) {
        this.userOpenid = userOpenid == null ? null : userOpenid.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAvatarurl() {
        return userAvatarurl;
    }

    public void setUserAvatarurl(String userAvatarurl) {
        this.userAvatarurl = userAvatarurl == null ? null : userAvatarurl.trim();
    }

    public String getUserTruename() {
        return userTruename;
    }

    public void setUserTruename(String userTruename) {
        this.userTruename = userTruename == null ? null : userTruename.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Date getUserCtime() {
        return userCtime;
    }

    public void setUserCtime(Date userCtime) {
        this.userCtime = userCtime;
    }

    public Date getUserCreattime() {
        return userCreattime;
    }

    public void setUserCreattime(Date userCreattime) {
        this.userCreattime = userCreattime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userOpenid=").append(userOpenid);
        sb.append(", userName=").append(userName);
        sb.append(", userAvatarurl=").append(userAvatarurl);
        sb.append(", userTruename=").append(userTruename);
        sb.append(", userSex=").append(userSex);
        sb.append(", userAge=").append(userAge);
        sb.append(", userTel=").append(userTel);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", userCtime=").append(userCtime);
        sb.append(", userCreattime=").append(userCreattime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}