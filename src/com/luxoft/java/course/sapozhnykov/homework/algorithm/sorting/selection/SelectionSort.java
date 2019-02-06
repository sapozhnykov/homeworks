package com.luxoft.java.course.sapozhnykov.homework.algorithm.sorting.selection;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int[] ints) {
        int[] newArray = Arrays.copyOf(ints, ints.length);

        for(int cur_index = 0; cur_index < newArray.length - 1; cur_index++) {
            int indexOfMin = cur_index;

            for(int shiftIndex = cur_index + 1; shiftIndex < newArray.length; shiftIndex++) {
                if(newArray[shiftIndex] < newArray[indexOfMin]) {
                    indexOfMin = shiftIndex;
                }
            }
            if(indexOfMin != cur_index) {
                int temp = newArray[indexOfMin];
                newArray[indexOfMin] = newArray[cur_index];
                newArray[cur_index] = temp;
            }
        }

        return newArray;
    }
}
