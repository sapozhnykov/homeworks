package com.luxoft.java.course.sapozhnykov.homework.algorithm.sorting.selection;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int[] ints) {
        int[] newArray = Arrays.copyOf(ints, ints.length);

        for(int curIndex = 0; curIndex < newArray.length - 1; curIndex++) {
            int indexOfMin = curIndex;

            for(int shiftIndex = curIndex + 1; shiftIndex < newArray.length; shiftIndex++) {
                if(newArray[shiftIndex] < newArray[indexOfMin]) {
                    indexOfMin = shiftIndex;
                }
            }
            if(indexOfMin != curIndex) {
                int temp = newArray[indexOfMin];
                newArray[indexOfMin] = newArray[curIndex];
                newArray[curIndex] = temp;
            }
        }

        return newArray;
    }
}
