package edu.codeschool.training.classes_objects.homework4;

import java.lang.Math;

public class MyMath {

    // Public methods
    //Get minimum element of the array of ints
    public int min(int[] arr) {
        if (arr == null) {
            System.out.println("End of function!");
            return -1;
        }
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }
        return minimum;
    }

    //Get minimum element of the array of doubles
    public double min(double[] arr) {
        if (arr == null) {
            System.out.println("End of function!");
            return -1;
        }
        double minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }
        return minimum;
    }

    //Get maximum element of the array of ints
    public int max(int[] arr) {
        if (arr == null) {
            System.out.println("End of function!");
            return -1;
        }
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i]) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    //Get maximum element of the array of doubles
    public double max(double[] arr) {
        if (arr == null) {
            System.out.println("End of function!");
            return -1;
        }
        double maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i]) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    //Summary of elements of ints
    public int sum(int[] arr) {
        if (arr == null) {
            System.out.println("End of function!");
            return -1;
        }
        int summary = 0;
        for (int i = 0; i < arr.length; i++) {
            summary += arr[i];
        }
        return summary;
    }

    //Summary of elements of doubles
    public double sum(double[] arr) {
        if (arr == null) {
            System.out.println("End of function!");
            return -1;
        }
        double summary = 0;
        for (int i = 0; i < arr.length; i++) {
            summary += arr[i];
        }
        return summary;
    }

    //Multiplication of elements of ints
    public int mull(int[] arr) {
        if (arr == null) {
            System.out.println("End of function!");
            return -1;
        }
        int multiply = 1;
        for (int i = 0; i < arr.length; i++) {
            multiply *= arr[i];
        }
        return multiply;
    }

    //Multiplication of elements of doubles
    public double mull(double[] arr) {
        if (arr == null) {
            System.out.println("End of function!");
            return -1;
        }
        double multiply = 1;
        for (int i = 0; i < arr.length; i++) {
            multiply *= arr[i];
        }
        return multiply;
    }

    //Check if the given number is prime or not
    public boolean isPrime(int number) {
        if (number < 0) {
            number = Math.abs(number);
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
