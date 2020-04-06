package com.bayamp.utils;

public class StringUtilsTests {

    public static String reverseString(String originalString){
        return new StringBuffer(originalString).reverse().toString();
    }
}
