package edu.codeschool.training.classes_objects.homework11.exercise1;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String string = "fd45";
        try {
            System.out.println(Integer.parseInt(string));
        }
        catch(NumberFormatException e) {
            System.out.println("there is an error in your code \n" + e.getMessage());
        }
        finally {
            System. out. println( "finally") ;
        }
    }
}
