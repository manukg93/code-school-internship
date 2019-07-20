package edu.codeschool.training.classes_objects.homework5;

abstract public class Shape {
    public String color;
    public boolean filled;

    // Constructors
    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        if (color != null) {
            this.color = color;
        }
        this.filled = filled;
    }

    // Getters and setters
    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Abstract methods
    abstract public double getArea();
    abstract public double getPerimeter();


    public String toString() {
        String shapeInfo;
        if (filled) {
            shapeInfo = "Shape of color " + color + " and filled.";
        } else {
            shapeInfo = "Shape of color " + color + " and not filled.";

        }
        return shapeInfo;
    }
}
