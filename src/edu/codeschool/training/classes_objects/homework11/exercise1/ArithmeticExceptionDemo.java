package edu.codeschool.training.classes_objects.homework11.exercise1;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e) {
            System.out.println("there is an arithmetic error in your code");
        }
        finally {
            System. out. println( "finally") ;
        }
    }
}
