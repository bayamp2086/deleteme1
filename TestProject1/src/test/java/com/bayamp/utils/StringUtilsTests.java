package com.bayamp.utils;

public class StringUtilsTests {
    public static String reverseString(String str) {
        StringBuffer buff = new StringBuffer(str);
        return buff.reverse().toString();
    }
}
