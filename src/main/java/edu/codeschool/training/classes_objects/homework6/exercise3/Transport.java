package edu.codeschool.training.classes_objects.homework6.exercise3;

public abstract class Transport implements Vehicle {
    private String color;
    private double maxSpeed;

    public Transport() {
        this.color="White";
        this.maxSpeed=10.5;
    }

    public Transport(String color, double maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
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
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void move(double distance) {
        System.out.println("The Distance of a ");
    }
}
