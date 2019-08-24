package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.homework6.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d=new Date(7,12,1992);

        System.out.println(d);
        d.plusDay(25);
        d.plusYear(5);
        System.out.println(d.toString());

    }

}
