package edu.codeschool.training.exceptions;

import java.io.FileNotFoundException;

// java program that demonstrates the use of throw
public class ThrowExcep extends FileNotFoundException  {
    static void fun() {
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException ex) {
            System.out.println("Exception caught inside fun()");
            throw ex; // rethrowing ex
        }
    }

    public static void main(String[] args) {
        try {
            fun();
        }
        catch (NullPointerException ex) {
            System.out.println("Exception caught in main()");
        }
    }
}
