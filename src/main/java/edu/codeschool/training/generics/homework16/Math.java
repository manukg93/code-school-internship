package edu.codeschool.training.generics.homework16;

public class Math <T extends Comparable> {

    // declare array of type T
    T[] arr;

    public  T min(T[] arr) {

        this.arr = arr;
        if (this.arr == null) {

            return null;
        }
        if (this.arr.length == 0) {

            System.out.println("array is empty");
            return null;
        }
        T min = this.arr[0];
        for (T el : this.arr) {

            if (el.compareTo(min) < 0) {

                min = el;
            }
        }
        return min;
    }

    public T max(T[] arr) {

        this.arr = arr;
        if (this.arr == null) {

            return null;
        }
        if (this.arr.length == 0) {

            System.out.println("array is empty");
            return null;
        }
        T max = this.arr[0];
        for (T el : this.arr) {

            if (el.compareTo(max) > 0) {

                max = el;
            }
        }
        return max;
    }

    public void sort(T[] arr) {

    }

    public void reverse(T[] arr) {

        this.arr = arr;
        if (this.arr == null || this.arr.length == 0) { return; }

        T temp;
        for (int i = 0; i < this.arr.length/2; i++) {
            temp = this.arr[i];
            this.arr[i] = this.arr[this.arr.length - 1 - i];
            this.arr[this.arr.length - 1 - i] = temp;
        }
    }

    public boolean search(T[] arr, T el) {

        this.arr = arr;
        if (this.arr == null || this.arr.length == 0) {

            return false;
        }
        for ( T element : this.arr ) {

            if (el.equals(element)) {

                return true;
            }
        }
        return false;
    }

    /*
    public T[] subArray(T[] arr, int offset, int len) {
        this.arr = arr;
        if (this.arr == null || this.arr.length == 0) { return null; }

        T[] subArray = (T[])new Comparable<T>()[len];
        if (offset >= 0 && len >= 0 && offset + len < this.arr.length) {
            for (int i = offset, j = 0; i < len; i++, j++) {
                subArray[j] = this.arr[i];
            }
        }

        return subArray;
    }

     */
}
