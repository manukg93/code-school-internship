package edu.codeschool.training.classes_objects.homework10.exercise2;

public class AlarmClock {
    public void wakeUp(WeekDay weekDay){
        switch (weekDay) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("Wake up it is weekend");
                break;
            default:
                System.out.println("Wake up and prepare for the work it is working day");
        }

    }
}
