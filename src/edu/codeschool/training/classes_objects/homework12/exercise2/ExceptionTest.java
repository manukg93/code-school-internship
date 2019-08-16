package edu.codeschool.training.classes_objects.homework12.exercise2;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IOException();
        }catch (Exception ex){
            System.out.println(ex + " handled ");
        }
    }
}
