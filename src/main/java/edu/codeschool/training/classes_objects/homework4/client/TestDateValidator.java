package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.*;

public class TestDateValidator {
    public static void main(String[] args) {
        //Inside main method create one object of type Date and check weather the date is valid or not.
        Date dateDefault= new Date();
        Date date1= new Date(35,4,1989);
        System.out.print(dateDefault);
        DateValidator.validateDate(dateDefault);
        System.out.print(date1);
        DateValidator.validateDate(date1);
    }
}
