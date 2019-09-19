package edu.codeschool.training.homework19.sorting_algorithms;

public class InsertionSort {
    public static void sort(int[] arr, int n) {
        for (int i = 1; i < arr.length; i++) {
            int el = arr[i];
            int j = i - 1;
            while (j >= 0 && el < arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
            }
            arr[j + 1] = el;
        }

    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
        sort(arr, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}