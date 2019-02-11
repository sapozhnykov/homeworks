package com.luxoft.java.course.sapozhnykov.homework.algorithm.additional2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncCalculator {
    public static void start() {
        System.out.println("<<<<<<<   F(x) = tg(2x) - 3, where x ∈ [a, b]   >>>>>>>>");
        int a = enterStartOfRange();
        int b = enterEndOfRange();
        int step = enterStep(a, b);
        double[][] resArray = calculate(a, b, step);
        showResult(resArray, a, b, step);
    }

    private static int enterStartOfRange() {
        System.out.println("Please, enter value of 'a':");
        return enterInteger();
    }

    private static int enterEndOfRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter value of 'b':");
        return enterInteger();
    }

    private static int enterStep(int a, int b) {
        int resStep = 0;
        int tempStep;
        int maxStep;
        boolean isStepAprove = false;

        while (!isStepAprove) {
            System.out.println("Please, enter step of range:");
            tempStep = enterInteger();
            if(a < b) {
                maxStep = b - a;
                if(tempStep > maxStep || tempStep <= 0) {
                    incorrectStep(a, b);
                } else {
                    resStep = tempStep;
                    isStepAprove = true;
                }
            } else if(a > b) {
                maxStep = a - b;
                if(tempStep > maxStep || tempStep >=0) {
                    incorrectStep(a, b);
                } else {
                    resStep = tempStep;
                    isStepAprove = true;
                }
            } else {
                if(tempStep != 0) {
                    incorrectStep(a, b);
                } else {
                    resStep = tempStep;
                    isStepAprove = true;
                }
            }
        }

        return resStep;
    }

    private static void incorrectStep(int a, int b) {
        System.out.println("Step is incorrect for range [" + a + ", " + b + "]. Try again...");
    }

    private static int enterInteger() {
        int number = 0;
        boolean isInteger = false;

        while (!isInteger) {
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextInt();
                isInteger = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Sorry, value is not Integer. Try again...");
            }
        }

        return number;
    }

    private static double[][] calculate(int a, int b, int step) {
        int arraylength;
        double[][] resArray;

        if(a < b) {
            arraylength = ((b - a) / Math.abs(step)) + 1;
            resArray = new double[arraylength][2];
            int iterator = 0;
            int tempElement = a;

            while (iterator < resArray.length && tempElement <= b) {
                resArray[iterator][0] = tempElement;
                resArray[iterator][1] = doFunction(tempElement);
                tempElement += step;
                iterator++;
            }
        } else if(a > b) {
            arraylength = ((a - b) / Math.abs(step)) + 1;
            resArray = new double[arraylength][2];
            int iterator = 0;
            int tempElement = a;

            while (iterator < resArray.length && tempElement >= b) {
                resArray[iterator][0] = tempElement;
                resArray[iterator][1] = doFunction(tempElement);
                tempElement += step;
                iterator++;
            }
        } else {
            resArray = new double[1][2];
            resArray[0][0] = a;
            resArray[0][1] = doFunction(a);
        }

        return resArray;
    }

    private static double doFunction(int x) {
        return Math.tan(2 * x) - 3;
    }

    private static void showResult(double[][] array, int a, int b, int step) {
        System.out.println();
        System.out.println("<<<<< F(x) = tg(2x) - 3, where x ∈ [" + a + ", " + b + "] and step = " + step +" >>>>>");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(j == 0) {
                    System.out.println("x = " + array[i][j]);
                } else {
                    System.out.println("F(x) = " + array[i][j]);
                }
            }
            System.out.println("_____________________");
        }
    }
}
