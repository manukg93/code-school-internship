package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Time;

public class TestTime {
    public static void main(String[] args) {
        Time t=new Time(4,15,23);
        System.out.println(t);
        t.nextSecond();
        System.out.println(t);
        t.previousSecond();
        System.out.println(t);
    }
}
