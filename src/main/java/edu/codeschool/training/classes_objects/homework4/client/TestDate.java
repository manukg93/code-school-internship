package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();

        date.setDay(1);
        date.setMonth(1);
        date.setYear(1992);

        System.out.println(date.toString());

        date.plusMonth(30);
        System.out.println(date.toString());

        date.plusDay(1000);
        System.out.println(date.toString());
    }
}
