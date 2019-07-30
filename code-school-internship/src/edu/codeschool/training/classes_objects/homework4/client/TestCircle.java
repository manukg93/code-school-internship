package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Circle;

public class TestCircle extends Circle {
    public static void main(String[] args) {
    Circle circle = new Circle();
    Circle circleRadius = new Circle(2.0);
    Circle circleRadiusColor = new Circle(3.0, "green");
        System.out.println("for object circle method 'getRadius' returns: " + circle.getRadius());
        System.out.println("for object circle method 'getArea' returns: " + circle.getArea());
        System.out.println("for object circle method 'getColor' returns: " + circle.getColor());
        System.out.println();
        System.out.println("for object circleRadius method 'getRadius' returns: " + circleRadius.getRadius());
        System.out.println("for object circleRadius method 'getArea' returns: " + circleRadius.getArea());
        System.out.println("for object circleRadius method 'getColor' returns: " + circleRadius.getColor());
        System.out.println();
        System.out.println("for object circleRadiusColor method 'getRadius' returns: " + circleRadiusColor.getRadius());
        System.out.println("for object circleRadiusColor method 'getArea' returns: " + circleRadiusColor.getArea());
        System.out.println("for object circleRadiusColor method 'getColor' returns: " + circleRadiusColor.getColor());
    }
}
