package edu.codeschool.training.classes_objects.homework5.exercise6;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(this.radius,2) * this.height;
        return area;
    }
}
