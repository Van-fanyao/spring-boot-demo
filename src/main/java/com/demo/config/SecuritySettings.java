package com.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: fanyao
 * @Date: 2019/4/1 17:01
 * @Description:
 */
@ConfigurationProperties(prefix = "securityconfig")
public class SecuritySettings {

    private String logoutsuccessurl="logout";

    private String permitall ="/api";

    private String deniedpage ="/deny";

    private String urlroles;

    public String getLogoutsuccessurl() {
        return logoutsuccessurl;
    }

    public void setLogoutsuccessurl(String logoutsuccessurl) {
        this.logoutsuccessurl = logoutsuccessurl;
    }

    public String getPermitall() {
        return permitall;
    }

    public void setPermitall(String permitall) {
        this.permitall = permitall;
    }

    public String getDeniedpage() {
        return deniedpage;
    }

    public void setDeniedpage(String deniedpage) {
        this.deniedpage = deniedpage;
    }

    public String getUrlroles() {
        return urlroles;
    }

    public void setUrlroles(String urlroles) {
        this.urlroles = urlroles;
    }
}
