package edu.codeschool.training.classes_objects.homework6.exercise1;


public class ArraysUtil {
    public static int[] concatenateTwoArrays(int array1[], int array2[]){
        int newArray[] = new int[array1.length + array2.length];
        int j;
        for (int i = 0; i < array1.length + array2.length; i++) {
            if(i < array1.length){
                newArray[i] = array1[i];
            }else{
                j = i - array1.length;
                newArray[i] = array2[j];
            }
        }
        return newArray;
    }

    public static int findIndex(int array[], int element){
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == element){
                result = i;
                break;
            }
        }
        return result;
    }

    public static int[] reverseArr(int array[]){
        int revArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            revArray[i] = array[array.length - 1 - i];
        }
        return revArray;
    }

    public static String toString(int array[]){
        String result = "";
        for(int i : array){
            result += i + ", ";
        }
//        for (int i = 0; i < array.length; i++) {
//            result += array[i] + ", ";
//        }
        return result;
    }

    public static int[] sort(int array[]){
        int temp;
        int i = 1;
        while (i < array.length){
            if(array[1] < array[0]) {
                temp = array[1];
                array[1] = array[0];
                array[0] = temp;
            }
            if(array[i] < array[i-1]){
                temp = array[i];
                array[i] = array[i -1];
                array[i -1] = temp;
                i--;
            } else {
                i++;
            }
        }

        return array;
    }

    public static int findSecond(int array[]){
        int sortArray[] = sort(array);
        return sortArray[array.length - 2];
    }

    public static int[] doubleArray(int array[]){
        int newArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * 2;
        }
        return newArray;
    }

    public static boolean contains(int array[], int element){
        boolean result = false;
        for(int i : array){
            if(i == element){
                result = true;
                break;
            }
        }
        return result;
    }
}
