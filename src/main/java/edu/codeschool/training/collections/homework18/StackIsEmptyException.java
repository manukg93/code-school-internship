package edu.codeschool.training.collections.homework18;

public class StackIsEmptyException extends Exception {
    private String message;

    public StackIsEmptyException() {
        this.message = null;
    }

    public StackIsEmptyException(String message) {
        this.message = message;
    }
}
