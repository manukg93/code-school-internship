package edu.codeschool.training.enums.homework10;

public class MonthTest {
    public static void main(String[] args) {

        // get Month objects
        Month[] months = Month.values();

        for (Month month : months) {

            System.out.println("name: " + month.name() +
                    " order: " + (month.ordinal() + 1) +
                    " days: " + month.getDaysCount());
        }
    }
}
