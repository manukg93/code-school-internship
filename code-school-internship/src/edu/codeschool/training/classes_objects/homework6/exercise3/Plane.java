package edu.codeschool.training.classes_objects.homework6.exercise3;

public class Plane extends Transport {
    private int maxHeight = 4000;
    private double maxWeight = 250;
    private String color = "blue";
    private double maxSpeed = 700;
    public String stop(){
        return "stop Plane";
    };
    public String start(){
        return "start Plane";
    };
    public String move(double distance){
        return "Plane will fly the distance(" + distance + ") in " + distance/this.maxSpeed + " hours";
    };

    public Plane(){

    }
    public Plane(int maxHeight, double maxWeight) {
        this.maxHeight = maxHeight;
        this.maxWeight = maxWeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
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
        return "Plane{" +
                "maxHeight=" + maxHeight +
                ", maxWeight=" + maxWeight +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
