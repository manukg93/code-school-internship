package edu.codeschool.training.classes_objects.homework6.exercise3;

public class Truck extends Car {
    public Truck(String name, String color, double maxSpeed) {
        super(name, color, maxSpeed);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String infoCar() {
        return  super.infoCar();

    }

    @Override
    public String infoType() {
        return super.infoType();
    }
}
