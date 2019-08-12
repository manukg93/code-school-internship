package edu.codeschool.training.exceptions.homework11.client;

import edu.codeschool.training.exceptions.homework11.BuiltInExceptions;

public class NullPointerException_Demo {
    public static void main(String[] args) {
        int[] arr = null;

        try {
            BuiltInExceptions.accessArrayElementAtIndex(arr, 0);
        }
        catch (NullPointerException ex) {
            System.out.println("Array stores nothing: " + ex.getMessage());
        }

        System.out.println("End of program");
    }
}
