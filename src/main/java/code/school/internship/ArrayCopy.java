package code.school.internship;

public class ArrayCopy {
    //array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}.
    public static void main(String[] args) {
        int[]Array={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[]Array1=Array;
        int arraylength=Array.length;
        for(int i=0; i<Array.length; i++ ){
            System.out.println("Array1  " +Array1[i]);

        }

    }


}
