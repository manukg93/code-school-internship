package edu.codeschool.training.homework16.exercise1;

import java.util.Date;

public class Car implements Comparable {
    private String name;
    private String model;
    private Date date;

    public Car(){};
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

    public boolean equals(Car car) {
        return this.date.equals(car.date);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int i = -1;
        if(this.getDate().compareTo(((Car) o).getDate()) < 0){
            i = 1;
        }else if(this.getDate().compareTo(((Car) o).getDate()) < 0){
            i = 0;
        }
        return i;
    }
}
