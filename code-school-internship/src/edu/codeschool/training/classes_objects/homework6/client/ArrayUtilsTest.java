package edu.codeschool.training.classes_objects.homework6.client;

import edu.codeschool.training.classes_objects.homework6.exercise1.ArraysUtil;

public class ArrayUtilsTest extends ArraysUtil {
    public static void main(String[] args) {
        int array[] = {1,22,53,4,93,42,77};
        int array2[] = {92,42,55,112,78,2,3,33};
        int result;
        int newArray[] = ArraysUtil.concatenateTwoArrays(array,array2);
        System.out.println(ArraysUtil.toString(newArray));
        result = ArraysUtil.findIndex(array, 42);
        System.out.println(result);
        newArray = ArraysUtil.reverseArr(array);
        System.out.println(ArraysUtil.toString(newArray));
        newArray = ArraysUtil.sort(array);
        System.out.println(ArraysUtil.toString(newArray));
        result = ArraysUtil.findSecond(array);
        System.out.println(result);
        System.out.println(ArraysUtil.contains(array, 77));


    }
}
