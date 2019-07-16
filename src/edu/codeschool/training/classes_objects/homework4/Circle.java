package edu.codeschool.training.classes_objects.homework4;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public String  getColor(){
        return this.color;
    }
}
