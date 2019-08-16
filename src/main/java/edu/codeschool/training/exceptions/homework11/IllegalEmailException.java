package edu.codeschool.training.exceptions.homework11;

public class IllegalEmailException extends RuntimeException {

    IllegalEmailException(String message) {
        super(message);

        try {
            int a = 10;
        } catch (StackOverflowError er) {
            System.out.println("aaa");
        }

        int a = 10;
    }
}
