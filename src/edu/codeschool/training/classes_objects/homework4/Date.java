package edu.codeschool.training.classes_objects.homework4;

public class Date {
    private int day;
    private int month;
    private int year;

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

    public void plusYear(int year){
        this.year += year;
    }
    public void plusDay(int days){
        if(this.day + days >31){
            int month = (this.day + days)/31;
            this.day = (this.day+days)-(31*month);
            for(int i=0;i<month;i++){
                this.month++;
                if(this.month > 12){
                    this.month = 1;
                    this.year++;
                }
            }
        }else{
            this.day += days;
        }
    }

    public String toString(){
        return "Date [" + this.year + "/" + this.month + "/" + this.day + "]";
    }
}
