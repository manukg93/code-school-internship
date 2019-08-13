package edu.codeschool.training.classes_objects.homework11.exercise1;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.toUpperCase());
        }
        catch(NullPointerException e) {
            System.out.println("there is an error in your code \n" + e.getMessage());
        }
        finally {
            System. out. println( "finally") ;
        }
    }
}
