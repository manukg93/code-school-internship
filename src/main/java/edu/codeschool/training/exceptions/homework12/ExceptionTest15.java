package edu.codeschool.training.exceptions.homework12;

public class ExceptionTest15 {
    public static void main(String[] args) {
        m();
        System.out.println("Code after exception handling");
    }

    static void m() {

        try {
            m();
        } catch (StackOverflowError er) {
            er.printStackTrace();
        }
    }
}
