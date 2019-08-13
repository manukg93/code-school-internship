package code.school.internship.homework4.client;


import code.school.internship.homework4.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        date.toString(1993,10,9);
        date.plusDay(25);
        date.plusYear(5);

        System.out.println(date.getYear());
        System.out.println(date.getDay());
    }
}
