package edu.codeschool.training.classes_objects.homework4.homework6;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
    }


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int plusYear(int y) {
        this.year = year + y;
        if (month > 12) {
            this.month = month - 12;
            this.year=year+1;
        }
            return this.year;
    }
        public int plusDay ( int d) {
            this.day = day + d;
            if (day > 31) {
                this.day = day - 30;
                this.month=month+1;
            }
            return this.day;
        }
            public String toString () {
                return "The Date is [" + this.day + "/" + this.month + "/" + this.year + "]";

            }
        }
