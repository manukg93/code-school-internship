package edu.codeschool.training.classes_objects.homework4.client;

public class TestTime {
    public static void main(String [] args) {
        Time time = new Time(15, 22, 56);
        System.out.println("The create object is "
                + time.gethour() + ":" + time.getminut() + ":" + time.getsecond());
        Time time1 = new Time(15, 22, 56);
        time1.NextSecond();
        System.out.println(time1.toString());
    }
}
