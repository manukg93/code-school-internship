package edu.codeschool.training.classes_objects.homework5.exercise_6;

public class Circle extends Shape {
    private double radius;


    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
