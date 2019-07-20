package edu.codeschool.training.classes_objects.homework4.client;

public class Time {
    private int hour;
    private int minut;
    private int second;
    Time (int a, int b, int c) {
    hour = a;
    minut = b;
    second = c;
    }
    public int gethour(){ return hour; }
    public void sethour() {
        if (hour>=0&&hour<=23)
            this.hour=hour;
    }
    public int getminut(){ return minut; }
    public void setminut(){
        if (minut>=0&&minut<59)
            this.minut=minut;
    }
    public int getsecond(){ return second; }
    public void setsecond(){
        if (second>=0&&second<=59)
            this.second=second;
    }
    public Time NextSecond(){
        return new Time(this.hour, this.minut, this.second++);
    }
    public Time PreviousSecond(){
        return new Time(this.hour, this.minut, this.second--);
    }
    public String toString(){
        return hour + ":" + minut + ":" + second;
    }
}
