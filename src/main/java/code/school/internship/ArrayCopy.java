package code.school.internship;

public class ArrayCopy {
    public static void main(String[] args) {
       // Given array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}.
         //       Write a Java program to copy the array to another array.
        int [] Array={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] ArrayCopy = Array;
        for(int i=0;i<Array.length;i++){

            System.out.println(ArrayCopy[i]);
        }
    }
}
