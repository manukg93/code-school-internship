package edu.codeschool.training.classes_objects.homework10.client;

import edu.codeschool.training.classes_objects.homework10.exercise1.Month;

public class MonthTest {
    public static void main(String[] args) {
        System.out.println();
        for(Month element: Month.values()){
            System.out.println(element + " - " +(element.ordinal() + 1) + " - " + element.getDaysCount());
        }
    }
}
