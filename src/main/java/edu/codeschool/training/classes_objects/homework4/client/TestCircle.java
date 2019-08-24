package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.homework6.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(3,"blue");
        System.out.println("Radius= "+c1.getRadius());
        System.out.println("Area  = "+c1.getArea());
        System.out.println("Color = "+c1.getColor());
        Circle c2=new Circle();
        System.out.println("Radius= "+c2.getRadius());
        System.out.println("Area  = "+c2.getArea());
        System.out.println("Color = "+c2.getColor());
        Circle c3=new Circle(10,"green");
        System.out.println("Radius= "+c3.getRadius());
        System.out.println("Area  = "+c3.getArea());
        System.out.println("Color = "+c3.getColor());
    }


}




