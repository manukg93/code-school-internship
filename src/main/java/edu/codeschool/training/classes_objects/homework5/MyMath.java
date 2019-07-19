package edu.codeschool.training.classes_objects.homework5;

public class MyMath {
    final static double PI = 3.14;

    // Public static methods
    //Get minimum element of the array of ints
    public static int min(int[] arr) {
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
    public static double min(double[] arr) {
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
    public static int max(int[] arr) {
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
    public static double max(double[] arr) {
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
    public static int sum(int[] arr) {
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
    public static double sum(double[] arr) {
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
    public static int mull(int[] arr) {
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
    public static double mull(double[] arr) {
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
    public static boolean isPrime(int number) {
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

    public static int pow(int m, int n) {
        int pow = 1;
        if (n == 0) {
            pow = 1;
        }
        for (int i = 1; i <= n; i++) {
            pow *= m;
        }
        return pow;
    }

}
