package com.example.pagehelper.utils;

import org.apache.logging.log4j.util.Strings;

import java.util.Objects;

public class Convert {
    public static Integer toInt(String strValue, Integer defaultValue) {
        if (Strings.isEmpty(strValue)) {
            return defaultValue;
        }
        return  Integer.valueOf(strValue);
    }
}
