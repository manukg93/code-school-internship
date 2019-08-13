package edu.codeschool.training.classes_objects.homework11.exercise2;

public class IllegalEmailException extends RuntimeException{

    String message;

    public IllegalEmailException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "IllegalEmailException: " +  message;
    }
}
