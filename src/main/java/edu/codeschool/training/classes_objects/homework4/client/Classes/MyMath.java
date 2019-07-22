package edu.codeschool.training.classes_objects.homework4.client.Classes;

public class MyMath {

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                array[i] = min;
            }
        }
        return min;
    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                array[i] = min;
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += sum + array[i];
        }
        return sum;
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += sum + array[i];
        }
        return sum;
    }

    public static int mull(int[] array) {
        int mull = 0;
        for (int i = 0; i < array.length; i++) {
            mull *= array[i];
        }
        return mull;
    }

    public static double mull(double[] array) {
        double mull = 0;
        for (int i = 0; i < array.length; i++) {
            mull *= array[i];
        }
        return mull;
    }

    public static int isOdd(int number) {
        for (int i = 2; i < number; i++)
            if (number % 2 == 0) {
                i = number;
            }
        return number;
    }

    public static boolean isPrime(int number) {
        if (number < 0) {
            number = Math.abs(number);
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
        public static int pow ( int a, int b){
            int result = 1;
            while (b != 0) {
                result *= a;
                b--;
            }
            System.out.println("the pow is: ");
            return result;
        }
    }
