package edu.codeschool.training.classes_objects.homework4.homework6;

public  class Circle {

    private double radius;
    private String color;

    public Circle(){
        radius=1.0;
        color="RED";
    }
    public Circle(double r){
        radius =r;
        color="RED";
    }
    public Circle(double r, String col){
        radius=r;
        color=col;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String getColor(){
        return color;
    }
}
