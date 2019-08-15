package edu.codeschool.training.enums.homework10;

public class AlarmClock {

    public static void wakeUp(Weekday weekday) {

        switch (weekday) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("Wake up!!! It is weekend!");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Wake up and get ready to work, it is working day.");
                break;
        }
    }
}
