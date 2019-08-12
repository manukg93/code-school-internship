package code.school.internship.classes_and_objects.homework.homework10;


// import homework10.WeekDays.*;

public class AlarmClock {
    public void wakeup(WeekDays weekDays) {
        for (WeekDays element : WeekDays.values()) {
            {
                System.out.println(element.getValue());
            }
            switch(weekDays) {
                case LUNDI:
                case MARDI:
                case MERCREDI:
                case JEUDI:
                case VENDREDI:
                    System.out.println("Wake up and prepare for the work it is working day");
                    break;
                case SAMEDI:
                case DIMANCHE:
                    System.out.println("This is week end, keep sleeping");
                    break;
                default:
            }
        }
    }
}