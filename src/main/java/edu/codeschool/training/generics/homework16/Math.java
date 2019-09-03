package edu.codeschool.training.generics.homework16;

public class Math {

    public  static<T extends Comparable> T min(T[] arr) {

        if (arr == null || arr.length == 0) {
            return null;
        }

        T min = arr[0];
        for (T el : arr) {

            if (el.compareTo(min) < 0) {

                min = el;
            }
        }
        return min;
    }

    public static <T extends Comparable> T max(T[] arr) {

        if (arr == null || arr.length == 0) {
            return null;
        }
        T max = arr[0];
        for (T el : arr) {

            if (el.compareTo(max) > 0) {

                max = el;
            }
        }
        return max;
    }

    //public void sort(T[] arr) {
//
    //}

    public static <T extends Comparable> void reverse(T[] arr) {

        if (arr == null || arr.length == 0) { return; }

        T temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static <T extends Comparable> boolean search(T[] arr, T el) {

        if (arr == null || arr.length == 0) { return false; }
        for ( T element : arr ) {

            if (el.equals(element)) { return true; }
        }
        return false;
    }

    public static <T extends Comparable> T[] subArray(T[] arr, int offset, int len) {

        if (arr == null || arr.length == 0) { return null; }


        T [] subArray = (T[]) new Comparable[len];
        subArray[0]=arr[0];
        System.out.println(true);

        if (offset >= 0 && len >= 0 && offset + len < arr.length) {
            for (int i = offset, j = 0; i <= len; i++, j++) {
                subArray[j] = arr[i];
            }
        }
        return subArray;
    }
}
