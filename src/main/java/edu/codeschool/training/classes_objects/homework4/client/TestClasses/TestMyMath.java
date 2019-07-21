package edu.codeschool.training.classes_objects.homework4.client.TestClasses;

import edu.codeschool.training.classes_objects.homework4.client.Classes.MyMath;

public class TestMyMath {
    public static void main(String[] args) {
        final int[] array = new int[]{1, 2, 8, 3, 6, 5, 4, 7, 8, 9};
        final double[] array1 = new double[]{1.5, 2.9, 8.9, 3.1, 6.2, 5.8, 4.7, 7.0, 8.78, 9.01};
        int number = 1489775697;
        System.out.println("Minimum element of int array is: ");
        System.out.println(MyMath.min(array));
        System.out.println("Minimum element of double array is: ");
        System.out.println(MyMath.min(array1));
        System.out.println("Maximum element of int array is: ");
        System.out.println(MyMath.max(array));
        System.out.println("Maximum element of double array is: ");
        System.out.println(MyMath.max(array1));
        System.out.println("The sum of the int array's elements is: ");
        System.out.println(MyMath.sum(array));
        System.out.println("The sum of the double array's elements is: ");
        System.out.println(MyMath.sum(array1));
        System.out.println("The multiplication of the int array's elements is: ");
        System.out.println(MyMath.sum(array));
        System.out.println("The multiplication of the double array's elements is: ");
        System.out.println(MyMath.sum(array1));
        System.out.println(MyMath.isOdd(number) + " Is odd number");
    }
}
