package edu.codeschool.training.classes_objects.homework6.exercise3;

public class Boat extends Transport {
    private int cruisingRange = 2000;
    private int maxWeight = 4000;
    private String color = "grey";
    private double maxSpeed = 50;
    public String stop(){
        return "stop Boat";
    };
    public String start(){
        return "start Boat";
    };
    public String move(double distance){
        return "Boat will sail in the distance(" + distance + ") in " + distance/this.maxSpeed + " hours";
    };

    public Boat(){
    }
    public Boat(int cruisingRange, int maxWeight) {
        this.cruisingRange = cruisingRange;
        this.maxWeight = maxWeight;
    }

    public int getCruisingRange() {
        return cruisingRange;
    }

    public void setCruisingRange(int cruisingRange) {
        this.cruisingRange = cruisingRange;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "cruisingRange=" + cruisingRange +
                ", maxWeight=" + maxWeight +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
