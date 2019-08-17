package edu.codeschool.training.exceptions.homework12;

public class ExceptionTest21 {

    public static void main(String[] args) {
        System.out.println("method return -> " + m());
    }

    static String m() {

        try {
            int i = 10 / 0;
        } catch (ArithmeticException e) {
            return "catch";
        } finally {
            return "finally";
        }
    }
}
