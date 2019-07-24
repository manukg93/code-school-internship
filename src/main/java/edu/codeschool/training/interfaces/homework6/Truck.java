package edu.codeschool.training.interfaces.homework6;

public class Truck extends Car {

    @Override
    public void start() {
        System.out.println("Truck started.");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped.");
    }

    @Override
    public void move(double distance) {
        System.out.println("Truck moved " + distance + " meters");
    }
}
