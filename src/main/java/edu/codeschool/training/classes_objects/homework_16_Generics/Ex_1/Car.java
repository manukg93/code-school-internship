package edu.codeschool.training.classes_objects.homework_16_Generics.Ex_1;

import java.util.Date;

public class Car implements Comparable<Car> {
    private String name;
    private String model;
    private Date date;

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
        if (car.date.getYear() != this.date.getYear()) {
            if (car.date.getYear() > this.date.getYear()) {
                return this.date.getYear() - car.date.getYear();
            } else {
                return this.date.getYear() - car.date.getYear();
            }


        }else return 0;
    }

    @Override
    public String toString() {
        return  name + "-" + model  + " ( produced by : " + date.getYear()+"/"+date.getMonth()+" )" ;
    }
}