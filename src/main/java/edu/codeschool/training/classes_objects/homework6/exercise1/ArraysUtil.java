package edu.codeschool.training.classes_objects.homework6.exercise1;


import java.util.Arrays;

public class ArraysUtil {
    public static int[] concatenateTwoArrays(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array, 0, array1.length);
        System.arraycopy(array2, 0, array, array1.length, array2.length);
        return array;
    }

    public static int findIndex(int[] array, int n) {
        int temp = -1;
        for (int i = 0; i < array.length; i++) {
            if (n >= array.length) break;
            else temp = array[n];
        }
        return temp;
    }

    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];

        }
        return reverse;
    }

    public static String toString(int[] array) {
        String str = "[";

        for (int i = 0; i < array.length - 1; i++) {
            str += array[i] + ",";

        }
        return str + array[array.length - 1] + "]";
    }

    public static int[] sortArray(int[] array) {
        // ??????????? chi tpum sort array@
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1) - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int findSecond(int[] array) {
        int max = array[0];
        int second = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                second = max;
                max = array[i];
            } else if (array[i] > second) {
                second = array[i];
            }

        }return second;
    }
    public static int[] doubleArray(int [] array){
        int [] doubleArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            doubleArray[i] = array[i] * 2;
        } return doubleArray;
    }
    public static String containsElement(int [] array,int arrayElement){
        String result="";
        String str1 = "The array contains the element ";
        String str2 = "The array is not contains the element ";
        for(int i=1;i<array.length;i++){
            if (array[i] == arrayElement) {
                result = str1+ arrayElement ;
                break;

            }else result=str2+ arrayElement;
        }
        return result;
    }
}