package edu.codeschool.training.classes_objects.homework4;

public class Circle {
    private double radius;
    private String color;

    // Default constructor
    public Circle() {
        radius = 1.0;
        color = "red";
    }


    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // public methods
    public double getRadius () {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getColor () {
        return color;
    }


}
