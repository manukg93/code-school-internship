package edu.codeschool.training.exceptions.homework11.quiz;

public class Question_6 {
    public static void main(String[] args) {
        try {
            int a[] = {1, 2, 3, 4};
            for (int i = 1; i <= 4; i++) {
                System.out.println("a[" + i + "] = " + a[i] + "n");
            }
        }
        catch (Exception e) {
            System.out.println("Error = " + e);
        }
        //catch (ArrayIndexOutOfBoundsException e) {
        //    System.out.println("ArrayIndexOutOfBoundsException");
        //}
    }
}
