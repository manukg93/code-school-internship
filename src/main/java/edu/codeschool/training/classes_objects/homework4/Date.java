package edu.codeschool.training.classes_objects.homework4;

public class Date {
    private int day;
    private int month;
    private int year;

    // Setter and getter methods
    public void setDay(int day) {
        if (day <= 0 || day > 31) {
            System.out.println("Wrong day");
            return;
        }

        this.day = day;
    }

    public void setMonth(int month) {
        if (month <= 0 || month > 12) {
            System.out.println("Wrong month.");
            return;
        }

        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    //Public methods
    public void plusYear(int year) {
        this.year += year;
    }

    public void plusDay(int day) {
        int d = this.day + day;
        if (d > 31) {
            d -= 31;
            this.day = d;
            this.month++;
        } else {
            this.day = d;
        }
    }

    public String toString() {
        String stringRepresentation = "Date [" + year + "/" + month + "/" + day + "]";
        return stringRepresentation;
    }

}
