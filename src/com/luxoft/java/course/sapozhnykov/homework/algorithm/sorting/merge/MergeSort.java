package com.luxoft.java.course.sapozhnykov.homework.algorithm.sorting.merge;

import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] arr){
        if(arr.length < 2){
            return arr;
        }
        int middle = arr.length / 2;
        int[] leftHalf = Arrays.copyOfRange(arr, 0, middle);
        int[] rightHalf = Arrays.copyOfRange(arr, middle, arr.length);
        return merge(sort(leftHalf), sort(rightHalf));
    }

    public static int[] merge(int[] leftSideOfArray, int[] rightSideOfArray){
        int length = leftSideOfArray.length + rightSideOfArray.length;
        int[] arr = new int[length];
        int indexLeft = 0;
        int indexRight = 0;
        for(int i = 0; i < length; i++){
            if(indexLeft == leftSideOfArray.length) {
                arr[i] = rightSideOfArray[indexRight];
                indexRight++;
            }
            else {
                if(indexRight == rightSideOfArray.length) {
                    arr[i] = leftSideOfArray[indexLeft];
                    indexLeft++;
                }
                else {
                    if(leftSideOfArray[indexLeft] < rightSideOfArray[indexRight]) {
                        arr[i] = leftSideOfArray[indexLeft];
                        indexLeft++;
                    }
                    else {
                        arr[i] = rightSideOfArray[indexRight];
                        indexRight++;
                    }
                }
            }
        }
        return arr;
    }
}
