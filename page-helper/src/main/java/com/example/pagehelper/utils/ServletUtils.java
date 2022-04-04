package com.example.pagehelper.utils;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class ServletUtils {
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = getRequestAttributes();
        return requestAttributes.getRequest();
    }

    public static ServletRequestAttributes getRequestAttributes() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        return (ServletRequestAttributes) requestAttributes;
    }

    public static Integer getParameterToInt(String parameterName, Integer defaultValue) {
        HttpServletRequest request = getRequest();
        String strValue = request.getParameter(parameterName);
        Integer intValue = Convert.toInt(strValue, defaultValue);
        return intValue;
    }

    public static Integer getParameterToInt(String parameterName) {
        return getParameterToInt(parameterName, null);
    }

}
