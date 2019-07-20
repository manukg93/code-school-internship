package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.exercise4.Circle;
import edu.codeschool.training.classes_objects.homework5.exercise4.Rectangle;
import edu.codeschool.training.classes_objects.homework5.exercise4.Square;

public class TestShapeSubClasses {
    public static void main(String[] args) {
        Circle circle = new Circle("green", true, 2.0);
        Rectangle rectangle = new Rectangle("blue", true,  3.0, 5.0);
        Square square = new Square(5.0);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
    }
}
