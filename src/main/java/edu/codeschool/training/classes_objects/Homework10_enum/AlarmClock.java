package edu.codeschool.training.classes_objects.Homework10_enum;

public class AlarmClock {
    static void wakeUp(WeekDay weekDay){
        switch (weekDay){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case FRIDAY:
            case THURSDAY:
                System.out.println("Wake up and prepare for the work it is working day");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Wake up it is weekend ");
                break;
                default:
        }
    }
}
