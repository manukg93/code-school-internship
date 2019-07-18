package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Date;
import edu.codeschool.training.classes_objects.homework4.DateValidator;


public class TestDateValidator {
    public static void main(String[] args) {
        Date date = new Date();
        date.setYear(1565);
        date.setMonth(13);
        date.setDay(32);

        DateValidator validator = new DateValidator();

        if (validator.validateDate(date)) {
            System.out.println(date.toString() + " is valid date");
        } else {
            System.out.println(date.toString() + " is not valid date");
        }
    }
}
