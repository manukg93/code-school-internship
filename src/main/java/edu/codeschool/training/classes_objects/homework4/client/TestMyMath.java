package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.MyMath;

public class TestMyMath {
    public static void main(String[] args) {
        int[] intArray = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] doubleArray = {10.5, -2.9, 8.9, 3.1, 0.0, 5.8, 4.7, 7.0, 8.78, 9.01};

        MyMath myLib = new MyMath();
        System.out.println("Min of ints: " + myLib.min(intArray));
        System.out.println("Min of doubles: " + myLib.min(doubleArray));
        System.out.println("Max of ints: " + myLib.max(intArray));
        System.out.println("Max of doubles: " + myLib.max(doubleArray));
        System.out.println("Sum of ints: " + myLib.sum(intArray));
        System.out.println("Sum of doubles: " + myLib.sum(doubleArray));
        System.out.println("Mult of ints: " + myLib.mull(intArray));
        System.out.println("Mult of doubles: " + myLib.mull(doubleArray));

        if (myLib.isPrime(1489775697)) {
            System.out.println("1489775697 number is prime");
        } else System.out.println("1489775697 number is not prime");
    }
}
