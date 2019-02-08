package com.luxoft.java.course.sapozhnykov.homework.algorithm.search.binary;

public class BinarySearch {
    public static int search(int number, int[] array) {
        if(array.length == 0) {
            return -1;
        }

        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        int minIndex = 0;
        int maxIndex = array.length - 1;
        boolean isAscending = false;

        if(firstElement < lastElement) {
            isAscending = true;
        }

        while (minIndex != maxIndex) {
            int middleIndex = minIndex + (maxIndex - minIndex) / 2;
            if(array[middleIndex] == number) {
                return middleIndex;
            }
            if(minIndex == middleIndex) {
                break;
            }
            if(array[middleIndex] > number) {
                if(isAscending){
                    maxIndex = middleIndex;
                }
                else {
                    minIndex = middleIndex+1;
                }
            }
            else {
                if(isAscending) {
                    minIndex = middleIndex + 1;
                }
                else {
                    maxIndex = middleIndex;
                }
            }
        }
        if(array[minIndex] == number) {
            return minIndex;
        }
        return -1;
    }
}
