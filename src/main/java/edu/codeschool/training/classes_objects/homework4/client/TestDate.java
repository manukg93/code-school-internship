package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date1 = new Date();

        date1.setDay(10);
        date1.setMonth(1);
        date1.setYear(1992);

        Date date2 = new Date(1, 1, 1992);
        System.out.println(date1.compareTo(date2));


    }
}
