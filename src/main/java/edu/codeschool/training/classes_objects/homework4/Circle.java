package edu.codeschool.training.classes_objects.homework4;

public class Circle{
    private double radius;
    private String color;

    public Circle(){
        radius=1.0;
        color="red";
    }
    public Circle(double r){
        radius=r ;
    }
    public Circle(double r, String c){
        radius=r;
        color=c;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}