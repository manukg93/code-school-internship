package edu.codeschool.training.classes_objects.homework4.client;

    public class Date {
       private int day;
       private int month;
       private int year;
        public Date(int a, int b, int c){
            day = a;
            month = b;
            year = c;
        }

        public int getday(){ return day; }
        public void setday(){ this.day = day; }
        public int getmonth(){ return month; }
        public void setmonth(){ this.month = month; }
        public int getyear(){ return year; }
        public void setyear(){ this.year = year; }

        public int PlusYear(int GivenYear){ return this.year += GivenYear; }
        public int PlusDay(int GivenDay){ return this.day += GivenDay; }
        public String toString() {
            return this.day + "/" + this.month + "/" + this.year;
        }
    }
