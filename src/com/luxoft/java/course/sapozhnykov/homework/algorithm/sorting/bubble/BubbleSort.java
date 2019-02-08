package com.luxoft.java.course.sapozhnykov.homework.algorithm.sorting.bubble;
import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[] ints) {
        int[] newArray = Arrays.copyOf(ints, ints.length);

        for(int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if(newArray[i] > newArray[j]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }
}
