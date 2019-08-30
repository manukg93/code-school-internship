package edu.codeschool.training.classes_objects.homework4;

public class Date implements Comparable<Date> {
    private int day;
    private int month;
    private int year;

    // constructors
    public Date() {

        new java.util.Date();
    }

    public Date(int d, int m, int y) {

        this.day = d;
        this.month = m;
        this.year = y;
    }

    // setter and getter methods
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

    @Override
    public int compareTo(Date d) {
        if (this.year > d.year || this.month > d.month || this.day > d.day) {

            return 1;
        }
        if (this.year < d.year || this.month < d.month || this.day < d.day) {

            return -1;
        }
        return 0;
    }

}
