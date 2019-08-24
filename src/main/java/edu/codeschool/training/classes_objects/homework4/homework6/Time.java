package edu.codeschool.training.classes_objects.homework4.homework6;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23) { this.hour = hour; }
        if (minute >= 0 && minute <= 59) { this.minute = minute; }
        if (second >= 0 && second <= 59) { this.second = second; }
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute){
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }
    public int getSecond () {
        return second;
    }

    public void setSecond ( int second){
        if (second >= 0 && second <= 59) {
            this.second = second;
        }

    }

    public void nextSecond () {
        Time timeNextSecond = new Time(this.hour,this.minute,(this.second+1));
        if ((this.second += 1) > 59) {
            this.second = 0;
            this.minute += 1;

        }
    }
    public void previousSecond(){
        Time timePreviousSecond=new Time(this.hour, this.minute,this.second-1);
        if((this.second-=1)<0){
            this.second=59;
            this.minute-=1;
        }
    }
    public String toString(){
        return  " The Time is[" + this.hour + ":" + this.minute + ":" + this.second +"]";
    }



}
