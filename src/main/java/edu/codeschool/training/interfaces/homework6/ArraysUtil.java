package edu.codeschool.training.interfaces.homework6;

public class ArraysUtil {

    // static methods

    // Concatenate two arrays
    public static int[] concatenateTwoArrays(int[] arr1, int[] arr2) {
        final int array1Length = arr1.length;
        final int array2Length = arr2.length;
        int[] concatenatedArrays = new int[array1Length + array2Length];

        if (arr1 != null && arr2 != null) {

            for (int i = 0; i < array1Length; i++) {
                concatenatedArrays[i] = arr1[i];
            }

            for (int i = array1Length; i < concatenatedArrays.length; i++) {

                concatenatedArrays[i] = arr2[i - array1Length];
            }
        }

        return concatenatedArrays;
    }

    // Find index
    public static int findIndex(int[] arr, int el) {
        if (arr != null) {

            for (int i = 0; i < arr.length; i++) {
                if (el == arr[i]) {
                    return i;
                }
            }
        }

        return -1;
    }

    // Reverse array
    public static int[] reverseArr(int[] arr) {
        int[] reversedArray = {};
        if (arr != null) {
            reversedArray = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                reversedArray[i] = arr[arr.length - 1 - i];
            }
        }
        return reversedArray;
    }

    // String representation of the array
    public static String toString(int[] arr) {
        String arrayInLine = "[";

        if (arr != null) {
            for (int i = 0; i < arr.length - 1; i++) {
                arrayInLine += arr[i] + ", ";
            }

                arrayInLine += arr[arr.length - 1] + "]";
        }

        return arrayInLine;
    }

    // Sort elements of the array
    public static void sort(int[] arr) {

    }
}
