package code.school.internship.classes_and_objects.homework.homework4;

public class Date {
    private int day;
    private int month;
    private int year;

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
    public int plusYear(int year1){

        return year+=year1;
    }
    public int plusDay(int day1){

        if(day+day1>31)
        {
            month++;
            return day=(day+day1)-31;
        }

        return day+=day1;
    }

    @Override
    public String toString() {
        return "Date["
                + day+"/"+
                month +"/"+
                year +
                ']';
    }

}