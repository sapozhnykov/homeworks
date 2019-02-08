package com.luxoft.java.course.sapozhnykov.homework.algorithm.additional;

public class Main {
    public static void main(String[] args) {
        int number = SumOfNumPairs.enterNumber();
        boolean result = SumOfNumPairs.isEquilsPair(number);
        SumOfNumPairs.showResult(number, result);
    }
}
