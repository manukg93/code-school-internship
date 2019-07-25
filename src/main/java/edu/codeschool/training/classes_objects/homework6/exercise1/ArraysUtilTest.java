package edu.codeschool.training.classes_objects.homework6.exercise1;

public class ArraysUtilTest {
    public static void main(String[] args) {
        System.out.println(ArraysUtil.toString(ArraysUtil.concatenateTwoArrays(new int[]{1,2,3},new int[]{4,5,6})));
        System.out.println(ArraysUtil.findIndex(new int[]{2,5,8},5));
        System.out.println(ArraysUtil.toString(ArraysUtil.reverseArray(new int[]{1,2,3,4,5})));
        System.out.println(ArraysUtil.toString(new int[]{1,2,3,4,5}));
        System.out.println(ArraysUtil.findSecond(new int[]{1,3,2,5,4}));
        System.out.println(ArraysUtil.toString(ArraysUtil.doubleArray(new int[]{1,2,3,4,5})));
        System.out.println(ArraysUtil.containsElement(new int[]{2,5,8,7,50},5));

    }

}
