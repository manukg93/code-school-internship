package edu.codeschool.training.classes_objects.Homework11_Exception.exercise_2;

public class IllegalPasswordException extends RuntimeException {
    public IllegalPasswordException(String message) {
        super(message);
    }
}
