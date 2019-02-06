package com.luxoft.java.course.sapozhnykov.homework.algorithm.sorting.merge;

import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] arr){
        if(arr.length < 2)
            return arr;
        int middle = arr.length / 2;
        int[] leftHalf = Arrays.copyOfRange(arr, 0, middle);
        int[] rightHalf = Arrays.copyOfRange(arr, middle, arr.length);
        return merge(sort(leftHalf), sort(rightHalf));
    }

    public static int[] merge(int[] leftHalf, int[] rightHalf){
        int n = leftHalf.length + rightHalf.length;
        int[] arr = new int[n];
        int indexLeft = 0;
        int indexRight = 0;
        for(int i = 0; i < n; i++){
            if(indexLeft == leftHalf.length) {
                arr[i] = rightHalf[indexRight];
                indexRight++;
            }
            else {
                if(indexRight == rightHalf.length) {
                    arr[i] = leftHalf[indexLeft];
                    indexLeft++;
                }
                else {
                    if(leftHalf[indexLeft] < rightHalf[indexRight]) {
                        arr[i] = leftHalf[indexLeft];
                        indexLeft++;
                    }
                    else {
                        arr[i] = rightHalf[indexRight];
                        indexRight++;
                    }
                }
            }
        }
        return arr;
    }
}
