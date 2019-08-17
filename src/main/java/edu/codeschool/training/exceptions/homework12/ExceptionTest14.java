package edu.codeschool.training.exceptions.homework12;

import java.io.IOException;

public class ExceptionTest14 {

    public static void main(String[] args) {

        try {
            throw new IOException();
        } catch (IOException ex) {
            System.out.println(ex + " handled");
        } catch (Exception e) {
            System.out.println(e + " handled");
        }
    }
}
