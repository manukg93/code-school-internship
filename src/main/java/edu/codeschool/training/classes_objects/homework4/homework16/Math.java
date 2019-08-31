package edu.codeschool.training.classes_objects.homework4.homework16;


import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.*;


public class Math<T> {

        public static <T  extends Comparable<T>> T min(T[]arr){

            T minValyu=arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(minValyu.compareTo(arr[i])>=0){
                    minValyu=arr[i];
                }
            }return minValyu;

            }

        public static <T  extends Comparable<T>> T max(T[]arr){

            T maxValyu=arr[0];
            for(int i=0; i<arr.length; i++ ){
                if(maxValyu.compareTo(arr[i])<0){
                    maxValyu=arr[i];
                }
            }return  maxValyu;
        }

        public static  <T extends Comparable<T>> T[] bubbleSort(T []arr){
            T temp=arr[0];
            for(int i=0; i<arr.length; i++){
             for(int j=1; j<(arr.length-i); j++){
                 if((arr[j-1].compareTo(arr[j]))>0){
                     temp=arr[j-1];
                     arr[j-1]=arr[j];
                     arr[j]=temp;

                 }
             }
            }
        return arr;

        }

        public static <T extends Comparable<T>> T[]revers(T []arr){
            Collections.reverse(Arrays.asList(arr));

            return arr;
        }

        public static <T extends  Comparable<T>> T[] serach(T[]arr, T find) {

            List list = Arrays.asList(arr);
            if (list.contains(find)) {
                System.out.print("Element is found in the Array  ");
            } else {
                System.out.print("Element is not found in the Array  ");
            }
            return arr;
        }

        public static <T extends Comparable<T>> T[]subArray(T[]arr,int offSet, int len){
            return Arrays.copyOfRange(arr,offSet,len);
        }


    }




