package edu.codeschool.training.classes_objects.homework4;

public class Time {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    //Constructors
    public Time(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) {
            System.out.println("Hours should be between 0 - 23");
            this.hour = 0;
            return;
        }
        this.hour = hours;

        if (minutes < 0 || minutes > 59) {
            System.out.println("Minutes must be between 0 - 59");
            this.minute = 0;
            return;
        }
        this.minute = minutes;

        if (seconds < 0 || seconds > 59) {
            System.out.println("Seconds must be between 0 - 59");
            this.second = 0;
            return;
        }
        this.second = seconds;
    }

    //Setter and getter methods
    public void setHour(int hours) {
        if (hours < 0 || hours > 23) {
            System.out.println("Hours should be between 0 - 23");
            this.hour = 0;
            return;
        }
        this.hour = hours;
    }

    public void setMinute(int minutes) {
        if (minutes < 0 || minutes > 59) {
            System.out.println("Minutes must be between 0 - 59");
            this.minute = 0;
            return;
        }
        this.minute = minutes;
    }

    public void setSecond(int seconds) {
        if (seconds < 0 || seconds > 59) {
            System.out.println("Seconds must be between 0 - 59");
            this.second = 0;
            return;
        }
        this.second = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //Public methods
    public Time nextSecond() {
        int sec = this.getSecond() + 1;
        int min = this.getMinute();
        int hour = this.getHour();

        if(sec > 59) {
            sec = 0;
            min++;
        }

        if (min > 59) {
            hour++;
            min = 0;
        }

        if (hour > 23) {
            hour = 0;
        }

        Time other = new Time(hour, min, sec);
        return other;
    }

    public Time previousSecond() {
        int sec = this.getSecond() - 1;
        int min = this.getMinute();
        int hour = this.getHour();

        if(sec < 0) {
            sec = 59;
            min--;
        }

        if (min < 0) {
            min = 0;
            hour--;
        }

        if (hour < 0) {
            hour = 23;
        }

        Time other = new Time(hour, min, sec);
        return other;
    }

    public String toString() {
        String timeInString = "Time [" + this.hour + ":" + this.minute + ":" + this.second + "]";
        return timeInString;
    }
}
