package edu.codeschool.training.classes_objects.homework4.homework16;

import java.util.Date;

public class Car extends Math implements Comparable <Car> {
    String name;
    String model;
    Date date;

    public Car() {
    }

    public Car(String name, String model, Date date) {
        this.name = name;
        this.model = model;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public int compareTo(Car car) {
        if (this.date.getYear()==car.date.getYear())
        {
            return 0;
        }
        else if (this.date.getYear()>car.date.getYear()) {
            return 1;
        }
        else {
            return -1;
        }

    }

    @Override
    public String toString() {
        return "Car   {" +
                "name   " + name + '\'' +
                ", model   " + model + '\'' +
                ", date   " + date.getYear() +"/"+date.getMonth()+"/"+date.getDay()+
                '}';
    }
}