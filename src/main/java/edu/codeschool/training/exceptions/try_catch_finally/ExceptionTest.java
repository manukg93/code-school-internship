package edu.codeschool.training.exceptions.try_catch_finally;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println("In try block");
            System.exit(0);
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
