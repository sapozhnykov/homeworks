package com.luxoft.java.course.sapozhnykov.homework.algorithm.sorting.insertion;

import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] ints) {
        int[] newArray = Arrays.copyOf(ints, ints.length);

        for(int cur_index = 1; cur_index < newArray.length; cur_index++) {
            int cur_element = newArray[cur_index];
            int j = cur_index;
            while (j > 0 && newArray[j - 1] > cur_element) {
                newArray[j] = newArray [j - 1];
                j = j - 1;
            }
            newArray[j] = cur_element;
        }

        return newArray;
    }
}
