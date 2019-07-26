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
        if (arr == null) {
            System.out.println("Not valid argument passed.");
            return;
        }

        // Bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Find the second largest element of the array
    public static int findSecond(int[] arr) {
        if (arr == null) {
            System.out.println("Not valid argument passed.");
            return 0;
        }

        ArraysUtil.sort(arr);

        return arr[arr.length - 2];
    }

    //
    public static int[] doubleArray(int[] arr) {
        if (arr == null) {
            System.out.println("Not valid argument passed.");
            return null;
        }

        int[] doubleElements = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            doubleElements[i] = arr[i] * 2;
        }

        return doubleElements;
    }

    // Check whether the array contains the element or not
    public static boolean contains(int[] arr, int element) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if (element == arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
