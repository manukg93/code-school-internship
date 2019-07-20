package edu.codeschool.training.classes_objects.homework4.client;

public class TestDate {
    public static void main(String[] args) {

        Date date = new Date(20, 07, 2019);
        System.out.println("The current date is "
                + date.getday() + "/" + date.getmonth() + "/" + date.getyear());
        Date date1 = new Date(20,07,2019);
        System.out.println("New date is " );
        date1.PlusDay(10);
        date1.PlusYear(25);
        System.out.println(date1.toString());

    }
}
