package homework10.ex2;

public class AlarmClock {
    public static void wakeUp(WeekDay weekDay){
        switch (weekDay){
            case MONDAY:
                System.out.println("Wake up and prepare for the work it is working day");
                break;
            case TUESDAY:
                System.out.println("Wake up and prepare for the work it is working day");
                break;
            case WEDNESDAY:
                System.out.println("Wake up and prepare for the work it is working day");
                break;
            case THURSDAY:
                System.out.println("Wake up and prepare for the work it is working day");
                break;
            case FRIDAY:
                System.out.println("Wake up and prepare for the work it is working day");
                break;
            case SATURDAY:
                System.out.println("Wake up it is weekend " );
                break;
            case SUNDAY:
                System.out.println("Wake up it is weekend " );
                break;
        }
    }
}
