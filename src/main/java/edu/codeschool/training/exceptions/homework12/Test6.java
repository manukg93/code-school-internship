package edu.codeschool.training.exceptions.homework12;

import java.io.IOException;

public class Test6 {

    public static void main(String[] args) {

        try {
            Test6 t = new Test6();
            t.doNothing();
            System.out.println("I have done nothing");
        } catch (IOException e) {
            System.out.println("Exception 1");
        }
    }

    private void doNothing() throws IOException {
        for (int i = 0; i < 10; i++) {

        }
    }
}
