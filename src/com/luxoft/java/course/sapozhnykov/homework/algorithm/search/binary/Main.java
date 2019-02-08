package com.luxoft.java.course.sapozhnykov.homework.algorithm.search.binary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Ascending array example
        //int [] arrayInt = {2, 4, 5, 8, 10, 20};

        //Descending array example
        int [] arrayInt = {20, 18, 15, 10, 4, 2};

        int searchingNum = 2;
        int index = BinarySearch.search(searchingNum, arrayInt);

        System.out.println("Current Array:");
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Searching number:");
        System.out.println(searchingNum);
        System.out.println("Index of element:");
        if(index >= 0) {
            System.out.println(index);
        }
        else {
            System.out.println("Element not found...");
        }
    }
}
