package edu.codeschool.training.generics.homework16;


import edu.codeschool.training.classes_objects.homework4.Date;

public class Car implements Comparable<Car> {

    String name;
    String model;
    Date date;

    public Car(String name, String model, Date date) {

        this.name = name;
        this.model = model;
        this.date = date;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // getters
    public String getName() { return this.name; }

    public String getModel() {
        return this.model;
    }

    public Date getDate() {
        return this.date;
    }

    @Override
    public int compareTo(Car obj) {
        if (this.date.compareTo(obj.getDate()) > 0) {
            return -1;
        }
        if (this.date.compareTo(obj.getDate()) < 0) {
            return 1;
        }
        return 0;
    }

   //@Override
   //public String toString() {

   //}
}
