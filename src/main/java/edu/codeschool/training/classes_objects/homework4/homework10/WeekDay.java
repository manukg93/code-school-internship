package edu.codeschool.training.classes_objects.homework4.homework10;

public enum WeekDay {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public void wakeUp(WeekDay weekDay) {
        switch (weekDay) {
            case SUNDAY:case SATURDAY:
                System.out.print("Wake up it is weekend                                  ");
                break;
            case MONDAY:case TUESDAY:case WEDNESDAY:case THURSDAY: case FRIDAY:
                System.out.print("Wake up and prepare for the work it is working day     ");
                break;


        }
    }




}