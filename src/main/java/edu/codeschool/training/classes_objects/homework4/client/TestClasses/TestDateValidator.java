package edu.codeschool.training.classes_objects.homework4.client.TestClasses;

import edu.codeschool.training.classes_objects.homework4.client.Classes.DateValidator;

public class TestDateValidator {
    public static void main(String[] args) {
        DateValidator dateValidator = new DateValidator(15, 10, 2020);
        System.out.println(dateValidator.toString());
    }
}
