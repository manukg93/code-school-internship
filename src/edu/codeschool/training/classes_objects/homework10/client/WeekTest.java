package edu.codeschool.training.classes_objects.homework10.client;

import edu.codeschool.training.classes_objects.homework10.exercise2.AlarmClock;
import edu.codeschool.training.classes_objects.homework10.exercise2.WeekDay;

public class WeekTest {
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.SATURDAY;
        AlarmClock alarmClock = new AlarmClock();
        alarmClock.wakeUp(weekDay);
    }
}
