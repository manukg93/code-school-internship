package edu.codeschool.training.classes_objects.homework6.exercise3;

public class Car extends Transport {
    private int year = 2012;
    private String brand = "Mercedes-Benz";
    private String color = "black";
    private double maxSpeed = 250;
    public String stop(){
        return "stop Car";
    };
    public String start(){
        return "start Car";
    };
    public String move(double distance){
        return "Car will go the distance(" + distance + ") in " + distance/this.maxSpeed + " hours";
    };

    public Car(){
    }
    public Car(int year, String brand) {
        this.year = year;
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
