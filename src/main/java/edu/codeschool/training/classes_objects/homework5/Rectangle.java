package edu.codeschool.training.classes_objects.homework5;

import edu.codeschool.training.classes_objects.homework5.Shape;

public class Rectangle extends Shape {
    private double length;
    private double  width;
    {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle() {
    }

    public Rectangle(double length) {
        this.length = length;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return 2*(length+width);
    }
    @Override
    public String toString(){
        return "A Rectangle with width="+this.width+ " , length="+this.length+" , which is a subclass of "+super.toString();
    }

}