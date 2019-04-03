package com.demo.service.impl;

import com.demo.domain.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: fanyao
 * @Date: 2019/4/3 10:16
 * @Description:
 */
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
    private Log log = LogFactory.getLog(getClass());
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
       User user = (User)authentication.getPrincipal();
       log.info("登录用户user:"+user.getName()+"login"+request.getContextPath());
       log.info("IP:"+getIpAddress(request));
       super.onAuthenticationSuccess(request,response,authentication);
    }

    private String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip==null||ip.length()==0||"unknown".equalsIgnoreCase(ip)){
            ip =request.getHeader("Proxy-Client-IP");
        }
        if (ip==null||ip.length()==0||"unknown".equalsIgnoreCase(ip)){
            ip =request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip==null||ip.length()==0||"unknown".equalsIgnoreCase(ip)){
            ip =request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip==null||ip.length()==0||"unknown".equalsIgnoreCase(ip)){
            ip =request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip==null||ip.length()==0||"unknown".equalsIgnoreCase(ip)){
            ip =request.getRemoteUser();
        }

        return ip;
    }
}
