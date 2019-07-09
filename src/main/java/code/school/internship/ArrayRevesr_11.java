package code.school.internship;

public class ArrayRevesr_11 {
    //Array={1,2,3,4,5,6}
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6,};
        int [] Array1= Array;
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array1[Array.length-(i+1)]);

            }
        }

    }