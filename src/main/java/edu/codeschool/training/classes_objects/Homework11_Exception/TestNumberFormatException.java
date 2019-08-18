package edu.codeschool.training.classes_objects.Homework11_Exception;

import java.util.Scanner;

public class TestNumberFormatException {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
try{
    int number = Integer.parseInt(input);

    System.out.println("The converted integer is " + number);
    scnr.close();
}catch(NumberFormatException ex){
    System.out.println("Caught NumberFormatException");
    System.out.println("You don't enter the number!!!");
}

    }
}
