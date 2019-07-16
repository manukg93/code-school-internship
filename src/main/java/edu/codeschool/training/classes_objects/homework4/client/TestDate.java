package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();

        date.setDay(9);
        date.setMonth(10);
        date.setYear(1992);

        System.out.println(date.toString());

        date.plusYear(5);
        date.plusDay(25);

        System.out.println(date.toString());
    }
}
