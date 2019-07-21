package edu.codeschool.training.classes_objects.homework5;

public class Circle extends Shape {
    private double radius;
    {
        this.radius=1.0;
    }
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
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
    public double  getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return "A Circle with radius="+this.radius+" , which is a subclass of " +super.toString();
    }
}
