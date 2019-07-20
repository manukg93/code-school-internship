package edu.codeschool.training.classes_objects.homework5.exercise6;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double area = this.height * this.width;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
