package code.school.internship.homework4;

public class Date {
    private double day;
    private double month;
    private double year;

    public void setDay(int day) {
        this.day = day;
    }

    public double getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getYear() {
        return year;
    }

    public void plusYear(int year){
        this.year += year;

    }

    public void plusDay(int day){
        this.day = this.day + day;

    }
    public double toString(double yyyy, double mm, double dd) {
        this.year = yyyy;
        this.month = mm;
        this.day = dd;
        return yyyy/mm/dd;

    }


}
