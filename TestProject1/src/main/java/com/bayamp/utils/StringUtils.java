package com.bayamp.utils;

public class StringUtils {

    public static String reverseString(String originalString) {
        StringBuffer buff = new StringBuffer(originalString);

        return buff.reverse().toString();
    }

}
