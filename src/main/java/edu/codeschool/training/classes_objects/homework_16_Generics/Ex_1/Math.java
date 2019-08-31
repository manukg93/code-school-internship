package edu.codeschool.training.classes_objects.homework_16_Generics.Ex_1;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Math <E extends Comparable> {
    private E[] list;
    private int size;


    public Math(E[] list, int size) {
        this.size = list.length;
    }

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
        }
        System.out.println(Arrays.toString(list));

    }

    public static <E extends Comparable<E>> void reverseList(E[] list) {
        for (int i = 0; i < list.length / 2; i++) {
            E tmp = list[i];
            list[i] = list[list.length - i - 1];
            list[list.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(list));
    }

    public static <E extends Comparable<E>> void searchElementContain(E[] list, E element) {
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(element) == 0) {
                System.out.println("The array contain the element : " + element);
                return;
            } else {
                System.out.println("The array don't contain the element : " + element);
                return;
            }
        }
    }

    public static <E extends Comparable<E>> E[] subArray(E[] list, int offset, int len) {
        E[] subArray = (E[]) new Comparable[len];
        if (offset >= 0 && len >= 0 && len <= (list.length - offset)) {
            int temp=0;
            for (int i = offset; i <= len-1; i++) {
                subArray[temp] = list[i];
                temp++;
            }
        }
        return subArray;
    }
}