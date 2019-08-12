package edu.codeschool.training.exceptions.homework11.client;

import edu.codeschool.training.exceptions.homework11.BuiltInExceptions;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;
        int div = 0;
        try {
            div = BuiltInExceptions.divideByZero(a, b);
        }
        catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception: " + ex.getMessage());
        }
        finally {
            System.out.println("div = " + div);
        }
    }
}
