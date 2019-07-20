package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.Circle;
import edu.codeschool.training.classes_objects.homework5.Rectangle;
import edu.codeschool.training.classes_objects.homework5.Square;

public class TestShape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("red", false, 12, 34);
        System.out.println(rect.toString());

        Circle circle = new Circle(9.8);
        System.out.println(circle.toString());

        Square square1 = new Square(7);
        System.out.println(square1.toString());

        Square square2 = new Square("black", true, 5.6);
        System.out.println(square2.toString());
        System.out.println(square1.getArea());
        System.out.println(square2.getPerimeter());
    }
}
