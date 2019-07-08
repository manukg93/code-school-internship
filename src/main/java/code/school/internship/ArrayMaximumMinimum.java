package code.school.internship;

public class ArrayMaximumMinimum {
    public static void main(String[] args) {
        //Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}
        //Write a Java program to find the maximum and minimum value of an array.
        int[] Array={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int arraylength=Array.length;
        int max=Array[0];
        for(int i=0; i<Array.length;i++){
            if(Array[i]>max){
                max=Array[i];
            }
        }
        System.out.println("Maximum value of an array is " + max);
        int min=Array[0];
        for(int i=0;i<Array.length;i++){
            if (Array[i]<min) {
                min=Array[i];
            }
        }
        System.out.println("Minimum value of an array is " +min);


    }
}
