package com.luxoft.java.course.sapozhnykov.homework.algorithm.sorting.bubble;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arrayInt = {2, 10, 23, 6, 8, 30};
        int [] newArrayInt = BubbleSort.sort(arrayInt);

        System.out.println("Current Array:");
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Sorted by BubbleSort:");
        System.out.println(Arrays.toString(newArrayInt));
    }
}
