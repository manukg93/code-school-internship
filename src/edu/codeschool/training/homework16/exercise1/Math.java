package edu.codeschool.training.homework16.exercise1;


import java.lang.reflect.Array;

public class Math<T> {


    public  <T extends Comparable>T min(T[] array){
        T min = array[0];
        for(int i = 1; i < array.length; i++){
            if(min.compareTo(array[i]) > 0)
                min = array[i];
        }
        return min;
    }
    public  <T extends Comparable>T max(T[] array){
        T max = array[0];
        for(int i = 1; i < array.length; i++){
            if(max.compareTo(array[i]) < 0)
                max = array[i];
        }
        return max;
    }

    public  <T extends Comparable>T[] sort (T[] array){
        T temp;
        int i = 1;
        while (i < array.length){
            if(array[1].compareTo(array[0]) < 0) {
                temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
            }

            if(array[i].compareTo(array[i-1]) < 0){
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

    public  <T> T[] reverse (T[] array){
        T reverse[] =  (T[]) new Object[array.length];

        for(int i = 0; i < array.length; i++){
            reverse[i] = array[array.length-i-1];
        }
        return reverse;
    }

    public  <T> boolean search(T[] array, T element) {
        boolean b = false;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(element)) {
                b = true;
                return b;
            }
        }
        return b;
    }



    public  <T> T[] subArray(T[] array, int offset, int len){
        T sub[] = (T[]) new Object[len];
        if(offset >= array.length){
            System.out.println("Offset can't be bigger than array length");
            return null;
        }
        int j = 0;
        for(int i = offset; i< offset+len; i++){
            sub[j] = array[i];
            j++;
        }
        return sub;
    }


}

