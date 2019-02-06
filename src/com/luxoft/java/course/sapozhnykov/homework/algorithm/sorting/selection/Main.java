package com.luxoft.java.course.sapozhnykov.homework.algorithm.sorting.selection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arrayInt = {2, 10, 23, 6, 8, 30};
        int [] newArrayInt = SelectionSort.sort(arrayInt);

        System.out.println("Current Array:");
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Sorted by SelectionSort:");
        System.out.println(Arrays.toString(newArrayInt));
    }
}
