package edu.codeschool.training.classes_objects.homework4.client;

public class Circle {
    private double radius=1.0;
    private String color="red";
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    public double getradius() {
        return radius;
    }
    public double getarea() {
        return radius*radius*Math.PI;
    }
    public String getcolor () {
        return color;
    }
}

