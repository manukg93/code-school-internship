package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.*;

public class TestDateValidator {
    public static void main(String[] args) {

       Date dateDefault=new Date();
       Date date1=new Date(16,4,1989);
        System.out.println(dateDefault);

        DateValidator.validateDate(dateDefault);
        System.out.println(date1);
        DateValidator.validateDate(date1);

    }

}
