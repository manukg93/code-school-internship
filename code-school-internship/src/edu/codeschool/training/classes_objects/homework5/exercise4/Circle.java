package edu.codeschool.training.classes_objects.homework5.exercise4;

public class Circle extends Shape {
    private double radius;
//    ?
    public Circle(){
        this.radius = 1.0;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * this.radius * this.radius;
        return  area;
    }

    public double getPerimeter(){
        double perimeter = Math.PI * this.radius * 2;
        return perimeter;
    }

    @Override
    public String toString() {
        String toStringShape = super.toString();
        return "A Circle with radius=" + this.radius + ", which is a subclass of " + toStringShape;
    }
}
