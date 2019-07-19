package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.MyMath;

public class TestMyMath {
    public static void main(String[] args) {
        int [] intArray  = {1,2,8,3,6,5,4,7,8,9};
        double [] doubleArray  = {1.5,2.9,8.9,3.1,6.2,5.8,4.7,7.0,8.78,9.01};
        final int M = 3;
        final int N = 7;
        final int NUM = 19;

        System.out.print("Minimum element of ints is ");
        System.out.println(MyMath.min(intArray));

        System.out.print("Maximum element of ints is ");
        System.out.println(MyMath.max(intArray));

        System.out.print("Minimum element of doubles is ");
        System.out.println(MyMath.min(doubleArray));

        System.out.print("Maximum element of doubles is ");
        System.out.println(MyMath.max(doubleArray));

        System.out.print("Sum of ints: ");
        System.out.println(MyMath.sum(intArray));

        System.out.print("Sum of doubles: ");
        System.out.println(MyMath.sum(doubleArray));

        System.out.print("Mult of ints: ");
        System.out.println(MyMath.mull(intArray));

        System.out.print("Mult of doubles: ");
        System.out.println(MyMath.mull(doubleArray));

        if (MyMath.isPrime(NUM)) {
            System.out.println(NUM + " is prime");
        } else {
            System.out.println(NUM + " is not prime");
        }
        System.out.print(M + " pow " + N + " is ");
        System.out.println(MyMath.pow(M, N));
    }
}
