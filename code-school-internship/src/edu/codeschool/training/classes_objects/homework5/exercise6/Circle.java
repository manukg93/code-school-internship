package edu.codeschool.training.classes_objects.homework5.exercise6;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(this.radius,2);
        return area;
    }
}
