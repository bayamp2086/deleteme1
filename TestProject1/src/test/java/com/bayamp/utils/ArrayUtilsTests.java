package com.bayamp.utils;

import java.util.Arrays;

public class ArrayUtilsTests {
    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    public static int[] reverseArray(int[] array) {
        int[] myArray = new int[array.length];
        int lastIndex = myArray.length - 1;
        int counter  = 0;
        for(int i = lastIndex;i>=0;i--) {
            myArray[counter] = array[lastIndex];
            counter++;
        }

        return myArray;
    }

    //Harish is adding some code in ArrayUtils
}
