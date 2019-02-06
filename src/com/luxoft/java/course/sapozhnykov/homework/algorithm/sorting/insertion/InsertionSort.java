package com.luxoft.java.course.sapozhnykov.homework.algorithm.sorting.insertion;

import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] ints) {
        int[] newArray = Arrays.copyOf(ints, ints.length);

        for(int curIndex = 1; curIndex < newArray.length; curIndex++) {
            int curElement = newArray[curIndex];
            int j = curIndex;
            while (j > 0 && newArray[j - 1] > curElement) {
                newArray[j] = newArray [j - 1];
                j = j - 1;
            }
            newArray[j] = curElement;
        }

        return newArray;
    }
}
