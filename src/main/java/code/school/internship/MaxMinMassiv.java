package code.school.internship;

public class MaxMinMassiv {
    //array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}
    public static void main(String[] args) {
        int[]Array= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int min=Array[0];
        for(int i=0; i<Array.length; i++){

            if (Array[i]<min) {
                min=Array[i];
            }
        }                System.out.println("min="+min);

        int max = Array[0];
        for(int i=0; i< Array.length;i++) {
            if (Array[i] > max) {
                max = Array[i];
            }
        }
            System.out.println("max=" + max);

    }

}
