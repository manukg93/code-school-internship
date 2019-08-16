package edu.codeschool.training.exceptions.homework12;

public class Test extends Exception {

    public static void main(String[] args) {

        try {
            System.out.println("My Custom Exception test");
            throw new Test();
        } catch (Exception e) {
            System.out.println("Test Exception");
        }
    }
}
