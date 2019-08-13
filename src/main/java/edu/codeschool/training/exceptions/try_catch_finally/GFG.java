package edu.codeschool.training.exceptions.try_catch_finally;

public class GFG {
    public static void main(String[] args) {

        // array of size 4
        int[] a = new int[4];

        try {
            for (int i = 0; i < 4; i++) {
                System.out.print(a[i] + "\t");
            }

            System.out.println("\nInside try block");
        }
        // catch block will not execute
        catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("\nCorresponding catch block caught the exception: " + ex.getMessage());
        }
        finally {
            System.out.println("Inside finally block");

            System.out.println("Outside try-catch-finally clause");

        }
    }
}
