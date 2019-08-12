package edu.codeschool.training.exceptions.homework11.client;

import edu.codeschool.training.exceptions.homework11.BuiltInExceptions;

public class ClassCastException_Demo {
    public static void main(String[] args) {

        Object obj = new Integer(10);

        try {
            System.out.println((Byte)obj);
        }
        catch (ClassCastException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("End of program");
    }
}
