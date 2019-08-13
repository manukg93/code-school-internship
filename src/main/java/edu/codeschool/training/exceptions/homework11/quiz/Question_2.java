package edu.codeschool.training.exceptions.homework11.quiz;

public class Question_2 {
    public static void main(String[] args) {
        try {
            throw new Test();
        }
        catch (Test t) {
            System.out.println("Got the exception ");
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
