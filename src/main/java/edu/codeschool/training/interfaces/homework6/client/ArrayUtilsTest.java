package edu.codeschool.training.interfaces.homework6.client;

import edu.codeschool.training.interfaces.homework6.ArraysUtil;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] array1 = {7, 4, 10, 0, 2, 1, 3, 9, 5};
        int[] array2 = {8, 9, 10};

        System.out.println("Array1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Array2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println();

        int[] a = ArraysUtil.concatenateTwoArrays(array1, array2);

        System.out.println("After concatenating: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Calling findIndex static method
        System.out.println("Index: " + ArraysUtil.findIndex(array1, 4));
        System.out.println();

        System.out.println("Array");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // Calling reverseArr static method
        int[] reversedArray1 = ArraysUtil.reverseArr(array1);

        System.out.println("Reversed array:");
        for (int i = 0; i < reversedArray1.length; i++) {
            System.out.print(reversedArray1[i] + " ");
        }
        System.out.println();

        // Calling toString() method for the array
        System.out.println("String representation of the array:");
        System.out.println(ArraysUtil.toString(array1));


        System.out.println(ArraysUtil.findSecond(array1));
        int[] doubleElements = ArraysUtil.doubleArray(array1);

        for (int i = 0; i < doubleElements.length; i++) {
            System.out.print(doubleElements[i] + " ");
        }
        System.out.println();
        System.out.println(ArraysUtil.contains(doubleElements, 8));
    }
}