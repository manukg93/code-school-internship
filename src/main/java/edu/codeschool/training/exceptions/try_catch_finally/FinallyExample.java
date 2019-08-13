package edu.codeschool.training.exceptions.try_catch_finally;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            // infinite loop
            for (;;) {
                System.out.println("infinite loop in try block");
            }
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
