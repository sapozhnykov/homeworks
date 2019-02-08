package com.luxoft.java.course.sapozhnykov.homework.algorithm.search.binary;

public class BinarySearch {
    public static int search(int number, int[] array) {
        if(array.length == 0) {
            return -1;
        }
        else {
            int firstElement = array[0];
            int lastElement = array[array.length - 1];
            if(firstElement < lastElement) {
                return seacrhAscending(number, array, 0, array.length - 1);
            }
            else {
                return seacrhDescending(number, array, 0, array.length - 1);
            }
        }
    }

    private static int seacrhAscending(int number, int[] array, int minIndex, int maxIndex) {
        int middleIndex = minIndex + (maxIndex - minIndex)/2;
        if(array[middleIndex] == number) {
            return middleIndex;
        } else if(middleIndex == maxIndex && array[middleIndex] != number) {
            return -1;
        } else if(array[middleIndex] < number) {
            return seacrhAscending(number, array, middleIndex + 1, maxIndex);
        } else {
            return seacrhAscending(number, array, minIndex, middleIndex);
        }
    }

    private static int seacrhDescending(int number, int[] array, int minIndex, int maxIndex) {
        int middleIndex = minIndex + (maxIndex - minIndex)/2;
        if(array[middleIndex] == number) {
            return middleIndex;
        } else if(middleIndex == maxIndex && array[middleIndex] != number) {
            return -1;
        } else if(array[middleIndex] < number) {
            return seacrhDescending(number, array, minIndex, middleIndex);
        } else {
            return seacrhDescending(number, array, middleIndex + 1, maxIndex);
        }
    }
}
