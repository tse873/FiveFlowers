package com.whjx.pojo;

import java.io.Serializable;
import java.util.Date;

public class AdminInfo implements Serializable {
    private Integer adminId;

    private String adminName;

    private String adminPassword;

    private String adminTelphone;

    private String adminEmail;

    private Date adminCreatTime;

    private Integer adminStaus;

    private static final long serialVersionUID = 1L;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminTelphone() {
        return adminTelphone;
    }

    public void setAdminTelphone(String adminTelphone) {
        this.adminTelphone = adminTelphone == null ? null : adminTelphone.trim();
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    public Date getAdminCreatTime() {
        return adminCreatTime;
    }

    public void setAdminCreatTime(Date adminCreatTime) {
        this.adminCreatTime = adminCreatTime;
    }

    public Integer getAdminStaus() {
        return adminStaus;
    }

    public void setAdminStaus(Integer adminStaus) {
        this.adminStaus = adminStaus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminId=").append(adminId);
        sb.append(", adminName=").append(adminName);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append(", adminTelphone=").append(adminTelphone);
        sb.append(", adminEmail=").append(adminEmail);
        sb.append(", adminCreatTime=").append(adminCreatTime);
        sb.append(", adminStaus=").append(adminStaus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}