package edu.codeschool.training.classes_objects.Homework11_Exception.exercise_2;

public class IllegalEmailException extends RuntimeException {
    public IllegalEmailException(String message) {
        super(message);
    }
}
