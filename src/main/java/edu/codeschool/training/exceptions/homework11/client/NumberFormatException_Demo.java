package edu.codeschool.training.exceptions.homework11.client;

import edu.codeschool.training.exceptions.homework11.BuiltInExceptions;

public class NumberFormatException_Demo {
    public static void main(String[] args) {

        try {
            System.out.println(BuiltInExceptions.parseStringToInt("1aa4"));
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
