package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Time;

public class TestTime {
    public static void main(String[] args) {
        Time time=new Time(4,3,3);
        System.out.println(time);
        time.previousSecond();
        System.out.println(time);
    }
}
