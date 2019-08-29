package edu.codeschool.training.classes_objects.homework_16_Generics.Ex_1;

import java.util.Arrays;

public class Math <E> {

    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
            }
        }
        return max;
    }

    public static <E extends Comparable<E>> E min(E[] list) {
        E min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(min) < 0) {
                min = list[i];
            }
        }
        return min;
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j].compareTo(list[j + 1]) > 0) {  // bad operand types for binary operator '>'
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }

            }
        }System.out.println(Arrays.toString(list));

    }

    public static <E extends Comparable<E>> void reverseList(E[] list){
        for (int i = 0; i < list.length/2; i++){
            E tmp=list[i];
            list[i] = list[list.length - i - 1];
            list[list.length - i - 1]=tmp;
        }
        System.out.println(Arrays.toString(list));
    }

    public static <E extends Comparable<E>> void searchElementContain(E[] list, E element){
        for (int i = 1; i < list.length; i++){
            if(list[i].compareTo(element)==0){
                System.out.println("The array contain the element : "+ element);
                return;
            }else {
                System.out.println("The array don't contain the element : "+ element);
                return;
            }
        }
    }

    public static <E extends Comparable<E>, len> void subArray(E[] array, int offset ,int len){
        System.out.print("[");
        for (int i = offset-1; i <array.length-1; i++){
            if(i<len-1){
                System.out.print(array[i]);
                System.out.print(" , ");
                continue;
            }if(i<len){
                System.out.print(array[i]);
            } else break;

        }
        System.out.print("]\n");
    }

}
