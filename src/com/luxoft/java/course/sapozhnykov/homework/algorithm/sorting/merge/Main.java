package com.luxoft.java.course.sapozhnykov.homework.algorithm.sorting.merge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arrayInt = {2, 10, 23, 6, 8, 30};
        int [] newArrayInt = MergeSort.sort(arrayInt);

        System.out.println("Current Array:");
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Sorted by MergeSort:");
        System.out.println(Arrays.toString(newArrayInt));
    }
}
