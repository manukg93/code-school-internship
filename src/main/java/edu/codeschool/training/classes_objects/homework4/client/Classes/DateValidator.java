package edu.codeschool.training.classes_objects.homework4.client.Classes;

public class DateValidator {
    public int day;
    public int month;
    public int year;
    public DateValidator(int day, int month, int year){
        if (day >= 1 && day <= 31) {
            this.day=day;
        } else {System.out.println("The incorrect input of day");}
       if (month > 1 && month < 12){
           this.month=month;
       } else {System.out.println("The incorrect input of month");}
       if (year > 0 ) {
           this.year = year;
       } else {System.out.println("The incorrect input of year");}
    }

    @Override
    public String toString() {
        return day + "/ " + month + "/ " + year;
    }
}
