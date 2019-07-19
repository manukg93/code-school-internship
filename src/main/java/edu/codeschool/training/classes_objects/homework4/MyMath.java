package edu.codeschool.training.classes_objects.homework4;

public class MyMath {
    private int arrInt[];
    private double arrDouble[];

    public MyMath(int[] arrInt) {
        this.arrInt = arrInt;
    }

    public MyMath(double[] arrDouble) {
        this.arrDouble = arrDouble;
    }

    public static int getMin(int arr[], int n) {
        int resultMin = arr[0];
        for (int i = 1; i < n; i++)
            resultMin = Math.min(resultMin, arr[i]);
        return resultMin;
    }

    public static double getDoubleMin(double arrDouble[], int k) {
        double resultDoubleMin = arrDouble[0];
        for (int i = 0; i < k; i++)
            resultDoubleMin = Math.min(resultDoubleMin, arrDouble[i]);
        return resultDoubleMin;
    }

    public static int getMax(int[] arrInt, int n) {
        int resultMax = arrInt[0];
        for (int i = 1; i < n; i++)
            resultMax = Math.max(resultMax, arrInt[i]);
        return resultMax;
    }

    public static double getDoubleMax(double[] arrDouble, int k) {
        double resultDoubleMax = arrDouble[0];
        for (int i = 1; i < k; i++)
            resultDoubleMax = Math.max(resultDoubleMax, arrDouble[i]);
        return resultDoubleMax;
    }

    public static int getIntSum(int arrInt[], int n) {
        int resultIntSum = 0;
        for (int i = 0; i < n; i++)
            resultIntSum += arrInt[i];
        return resultIntSum;
    }

    public static double getDoubleSum(double arrDouble[], int k) {
        int resultDoubleSum = 0;
        for (int i = 0; i < k; i++)
            resultDoubleSum += arrDouble[i];
        return resultDoubleSum;
    }

    public static int getMull(int arrInt[], int n) {
        int resultIntMull = 1;
        for (int i = 0; i < n; i++)
            resultIntMull *= arrInt[i];
        return resultIntMull;
    }

    public static double getDoubleMull(double arrDouble[], int k) {
        int resultDoubleMull = 1;
        for (int i = 0; i < k; i++)
            resultDoubleMull *= arrDouble[i];
        return resultDoubleMull;
    }

    public static String getIsPrime(int number) {
        for(int i=2; i<=number/2;i++){
            if(number%i==0){
                return "the number is not prime";
            }
        }
        return "Number "+number+ " is prime";
    }
    }