package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date1=new Date(9,12,1992);
        System.out.println(date1);
        date1.plusDay(25);
        date1.plusYear(5);
        System.out.println(date1);
    }
}
