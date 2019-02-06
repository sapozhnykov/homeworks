package com.luxoft.java.course.sapozhnykov.homework.algorithm.sorting.insertion;

import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] ints) {
        int[] newArray = Arrays.copyOf(ints, ints.length);

        for(int curIndex = 1; curIndex < newArray.length; curIndex++) {
            int cur_element = newArray[curIndex];
            int j = curIndex;
            while (j > 0 && newArray[j - 1] > cur_element) {
                newArray[j] = newArray [j - 1];
                j = j - 1;
            }
            newArray[j] = cur_element;
        }

        return newArray;
    }
}
