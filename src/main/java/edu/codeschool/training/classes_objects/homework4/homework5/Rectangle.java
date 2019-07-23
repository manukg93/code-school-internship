package edu.codeschool.training.classes_objects.homework4.homework5;

public class Rectangle extends Shape {
    double width;
    double  length;

    public Rectangle(){
        width=1.0;
        length=1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
