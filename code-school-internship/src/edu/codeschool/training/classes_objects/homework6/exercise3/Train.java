package edu.codeschool.training.classes_objects.homework6.exercise3;

public class Train extends Transport {
    private int countPeople = 200;
    private int countCars = 7;
    private String color = "white";
    private double maxSpeed = 200;
    public String stop(){
        return "stop Train";
    };
    public String start(){
        return "start Train";
    };
    public String move(double distance){
        return "Train will go the distance(" + distance + ") in " + distance/this.maxSpeed + " hours";
    };

    public Train(){

    }
    public Train(int countPeople, int countCars) {
        this.countPeople = countPeople;
        this.countCars = countCars;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public int getCountCars() {
        return countCars;
    }

    public void setCountCars(int countCars) {
        this.countCars = countCars;
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
        return "Train{" +
                "countPeople=" + countPeople +
                ", countCars=" + countCars +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
