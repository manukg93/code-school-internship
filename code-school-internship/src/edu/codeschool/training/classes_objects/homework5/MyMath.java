package edu.codeschool.training.classes_objects.homework5;

public class MyMath {

    public static int min(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }

    public static double min(double[] arr){
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }

    public static int max(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > min)
                min = arr[i];
        }
        return min;
    }

    public static double max(double[] arr){
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > min)
                min = arr[i];
        }
        return min;
    }


    public static int sum(int[] arr){
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
                sum += arr[i];
        }
        return sum;
    }

    public static double sum(double[] arr){
        double sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
                sum += arr[i];
        }
        return sum;
    }

    public static int mull(int[] arr){
        int mull = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mull *= arr[i];
        }
        return mull;
    }

    public static double mull(double[] arr){
        double mull = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mull *= arr[i];
        }
        return mull;
    }

    public static boolean isPrime(int number){
        boolean b = false;
        for(int i = 2; i < number/2; i++){
            if(number % i == 0){
                b = true;
                break;
            }
        }
        return b;
    }

    public static int pow(int m, int n){
        int result = 1;
        for (int i = 0; i <n ; i++) {
            result = result*m;
        }
        return result;
    }

}
