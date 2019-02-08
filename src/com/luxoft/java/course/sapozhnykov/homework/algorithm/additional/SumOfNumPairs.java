package com.luxoft.java.course.sapozhnykov.homework.algorithm.additional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumPairs {

    public static boolean isEquilsPair(int number) {
        int first = number / 1000;
        int second = number % 1000 / 100;
        int third = number % 100 / 10;
        int fourth = number % 10;
        return (first + second) == (third + fourth);
    }

    public static int enterNumber() {
        int number = -1;
        while (number < 0 || number > 9999) {
            Scanner scanner = new Scanner(System.in);
            showToDoText();
            try {
                number = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                showErrorText();
            }
            if(number < 0 || number > 9999) {
                showErrorText();
            }
        }
        return number;
    }

    private static void showErrorText() {
        System.out.println("Invalid number. Please, try again...");
    }

    private static void showToDoText() {
        System.out.println("Enter some positive four-digit integer:");
    }

    public static void showResult(int number, boolean result) {
        System.out.println("Your number " + number + " is " + result);
    }
}
