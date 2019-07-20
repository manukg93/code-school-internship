package edu.codeschool.training.classes_objects.homework5.exercise4;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
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
        double area = this.width * this.length;
        return  area;
    }

    public double getPerimeter(){
        double perimeter = (this.length + this.width) * 2;
        return perimeter;
    }

    @Override
    public String toString() {
        String toStringShape = super.toString();
        return "A Rectangle with width=" + this.width + " and length=" + this.length + ", which is a subclass of " + toStringShape;
    }
}
