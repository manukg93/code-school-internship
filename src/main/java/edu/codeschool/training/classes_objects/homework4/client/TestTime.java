package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Time;

public class TestTime {
    public static void main(String[] args) {
        Time time = new Time(12, 32, 0);
        System.out.println(time.toString());

        Time nextSecond = time.nextSecond();
        System.out.println(nextSecond.toString());

        Time prevSecond = time.previousSecond();
        System.out.println(prevSecond.toString());
    }
}
