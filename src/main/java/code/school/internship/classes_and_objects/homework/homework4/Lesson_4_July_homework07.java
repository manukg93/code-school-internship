package code.school.internship.classes_and_objects.homework.homework4;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date(9,10,1999);
        date.plusYear(5);
        date.plusDay(25);

        System.out.println(date.toString());
    }
