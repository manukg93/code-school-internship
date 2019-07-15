package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.3);
        Circle circle3 = new Circle(2.5, "yellow");

        System.out.println("Circle1 radius: " + circle1.getRadius());
        System.out.println("Circle1 area: " + circle1.getArea());
        System.out.println("Circle1 color: " + circle1.getColor());
        System.out.println();

        System.out.println("Circle2 radius: " + circle2.getRadius());
        System.out.println("Circle2 area: " + circle2.getArea());
        System.out.println("Circle2 color: " + circle2.getColor());
        System.out.println();

        System.out.println("Circle3 radius: " + circle3.getRadius());
        System.out.println("Circle3 area: " + circle3.getArea());
        System.out.println("Circle3 color: " + circle3.getColor());
    }
}
