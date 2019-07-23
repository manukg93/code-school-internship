package edu.codeschool.training.classes_objects.homework4.homework5;

public class MyMath {
    public static final class Variable {
        static double PI = 3.14;
    }

    public MyMath() {

    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double min(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double max(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }
        return sum;

    }

    public static double sum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;

    }

    public static int mull(int[] arr) {
        int mull = 1;
        for (int i = 0; i < arr.length; i++) {
            mull *= arr[i];
        }
        return mull;
    }

    public static double mull(double[] arr) {
        double mull = 1;
        for (int i = 0; i < arr.length; i++) {
            mull *= arr[i];
        }
        return mull;
    }

    public static void isPrime(int n) {
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < n / 2; j++) {
                if (i % j == 0)
                    System.out.println("The number is not prime");



            } System.out.println("The number is prime");
        }
    }

            public static int pow ( int m, int n){
                int pow = 1;
                for (int i = 1; i <= n; i++) {
                    pow *= m;
                }
                return pow;
    }

}


