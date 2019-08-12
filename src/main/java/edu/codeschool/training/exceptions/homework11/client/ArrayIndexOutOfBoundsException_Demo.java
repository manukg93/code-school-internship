package edu.codeschool.training.exceptions.homework11.client;

import edu.codeschool.training.exceptions.homework11.BuiltInExceptions;

public class ArrayIndexOutOfBoundsException_Demo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 10};

        try {
            System.out.println(BuiltInExceptions.accessArrayElementAtIndex(arr, -1));
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Not valid index: " + ex.getMessage());
        }

        System.out.println("End of program");
    }
}
