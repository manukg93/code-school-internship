package edu.codeschool.training.classes_objects.homework5.exercise_6;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeName, double width, double height) {
        super(shapeName);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return height*width;
    }
}
