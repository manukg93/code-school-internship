package edu.codeschool.training.classes_objects.Homework10_enum;

public class AlarmClockTest {
    public static void main(String[] args) {
        WeekDay day=WeekDay.FRIDAY;
        AlarmClock.wakeUp(day);
        AlarmClock.wakeUp(WeekDay.SUNDAY);
    }
}
