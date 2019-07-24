package edu.codeschool.training.interfaces.homework6;

abstract public class Transport implements Vehicle {
    String color;
    double maxSpeed;

    // Constructors
    public Transport() {
        this.color = "";
        this.maxSpeed = 0.0;
    }

    public Transport (String color) {
        if (color != null) {
            this.color = color;
        }
    }

    public Transport(double maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    public Transport (String color, double maxSpeed) {
        if (color != null && maxSpeed > 0) {
            this.color = color;
            this.maxSpeed = maxSpeed;
        }
    }

    // Getters ans setters
    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }

    public String getColor() {
        return this.color;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }
}
