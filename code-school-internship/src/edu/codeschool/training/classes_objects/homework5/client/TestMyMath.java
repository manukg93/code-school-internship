package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.MyMath;

public class TestMyMath {
    public static void main(String[] args) {
        int [] intArray  = {1,2,8,3,6,5,4,7,8,9};
        double [] doubleArray  = {1.5,2.9,8.9,3.1,6.2,5.8,4.7,7.0,8.78,9.01};
        System.out.println(MyMath.min(intArray));
        System.out.println(MyMath.max(intArray));
        System.out.println(MyMath.min(doubleArray));
        System.out.println(MyMath.max(doubleArray));
        System.out.println(MyMath.sum(intArray));
        System.out.println(MyMath.sum(doubleArray));
        System.out.println(MyMath.mull(intArray));
        System.out.println(MyMath.mull(doubleArray));

        System.out.println(MyMath.pow(3, 7));
        System.out.println(MyMath.isPrime(1489775697));
    }
}
