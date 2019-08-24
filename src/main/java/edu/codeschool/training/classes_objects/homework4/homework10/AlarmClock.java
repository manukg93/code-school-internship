package edu.codeschool.training.classes_objects.homework4.homework10;

public class AlarmClock {
    public static void main(String[] args) {
        for(WeekDay weekDay: WeekDay.values()){
            weekDay.wakeUp(weekDay);

            System.out.println(weekDay);
        }


    }
}
