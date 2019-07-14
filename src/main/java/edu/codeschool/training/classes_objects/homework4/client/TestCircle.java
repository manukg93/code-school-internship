package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1= new Circle(10,"White");
            System.out.println("Radius is Circle1: " + circle1.getRadius());
            System.out.println("Area is Circle1: "+ circle1.getArea());
            System.out.println("Color is Circle1: "+circle1.getColor());
        Circle circle2=new Circle(20,"Yellow");
            System.out.println("Radius is Circle2: " + circle1.getRadius());
            System.out.println("Area is Circle2: "+ circle1.getArea());
            System.out.println("Color is Circle2: "+circle1.getColor());
        Circle circle3= new Circle(30,"Green");
            System.out.println("Radius is Circle3: " + circle1.getRadius());
            System.out.println("Area is Circle3: "+ circle1.getArea());
            System.out.println("Color is Circle 3: "+circle1.getColor());

    }

}