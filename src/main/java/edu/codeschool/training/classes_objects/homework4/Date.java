package edu.codeschool.training.classes_objects.homework4;

public class Date {
    private int day;
    private int month;
    private int year;

    // Setter and getter methods
    public void setDay(int day) {
        if (day <= 0 || day > 31) {
            System.out.println("Not valid day");
            return;
        }

        this.day = day;
    }

    public void setMonth(int month) {
        if (month <= 0 || month > 12) {
            System.out.println("Not valid month.");
            return;
        }

        this.month = month;
    }

    public void setYear(int year) {
        if (year < 0) {
            System.out.println("Not valid year.");
        }

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
    public void plusYear(int years) {
        if (years < 0) {
            return;
        }
        this.year += years;
    }

    public void plusMonth(int months) {
        if (months < 0) {
            return;
        }

        this.month += months;

        if (this.month > 12) {
            this.year += this.month / 12;
            this.month %= 12;
        }
    }

    public void plusDay(int days) {
        if (days < 0) {
            return;
        }

        this.day += days;

        if (this.day > 31) {
            this.month += this.day / 31;
            this.day %= 31;
        }

        if (this.month > 12) {
            this.year += this.month / 12;
            this.month %= 12;
        }
    }

    public String toString() {
        String stringRepresentation = "Date [" + year + "/" + month + "/" + day + "]";
        return stringRepresentation;
    }

}
