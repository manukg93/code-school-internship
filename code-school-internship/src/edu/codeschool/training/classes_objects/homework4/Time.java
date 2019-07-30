package edu.codeschool.training.classes_objects.homework4;

public class Time {
    private int hour,minute,second;
    public Time(){
    }
    public Time(int hour,int minute,int second){
        if(hour >= 0 && hour <= 23)
            this.hour = hour;
        if(minute >= 0 && minute <= 59)
            this.minute = minute;
        if(second >= 0 && second <= 59)
            this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour >= 0 && hour <= 23)
            this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute <= 59)
            this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second >= 0 && second <= 59)
            this.second = second;
    }

    public Time nextSecond(){
        return new Time(this.hour,this.minute,this.second++);
    }
    public Time previousSecond(){
        return new Time(this.hour,this.minute,this.second--);
    }
    public String toString(){
        return "[" + this.hour + ":" + this.minute + ":" + this.second + "]";
    }
}
