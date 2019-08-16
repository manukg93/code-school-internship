package edu.codeschool.training.exceptions.homework12;

public class Test2 extends Exception {

    private String message;

    // provide default constructor
    public Test2() {}

    // parameterized constructor
    public Test2(String message) {

        this.message = message;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        try {
            if ((a % b) > 0) {
                throw new Test2(); // constructor Test2() is undefined
            }
        } catch (Exception e) {
            System.out.println("Test2 Exception");
        }
    }
}
