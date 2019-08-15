package edu.codeschool.training.enums.homework10;

public class TestWeekday {
    public static void main(String[] args) {
        Weekday weekday1 = Weekday.SATURDAY;
        Weekday weekday2 = Weekday.MONDAY;

        AlarmClock.wakeUp(weekday1);
        AlarmClock.wakeUp(weekday2);
    }

}
