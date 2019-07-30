package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Time;

public class TestTime extends Time {
    public static void main(String[] args) {
        Time time = new Time(22,22,22);
        System.out.println(time.toString());
        time.nextSecond();
        System.out.println(time.toString());
    }
}
