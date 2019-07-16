package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Rectangle;

public class TestRectangle extends Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangleArea = new Rectangle(2.0f);
        Rectangle rectanglePerimeter = new Rectangle(3.0f, 2.0f);
        rectangle.setLength(2.5f);

        System.out.println("for object rectangle method 'getLength()' returns: " + rectangle.getLength());
        System.out.println("for object rectangle method 'calculateArea()' returns: " + rectangle.calculateArea());
        System.out.println("for object rectangle method 'calculatePerimeter()' returns: " + rectangle.calculatePerimeter());
        System.out.println();
        System.out.println("for object rectangleArea method 'getLength()' returns: " + rectangleArea.getLength());
        System.out.println("for object rectangleArea method 'calculateArea()' returns: " + rectangleArea.calculateArea());
        System.out.println("for object rectangleArea method 'calculatePerimeter()' returns: " + rectangleArea.calculatePerimeter());
        System.out.println();
        System.out.println("for object rectanglePerimeter method 'getLength()' returns: " + rectanglePerimeter.getLength());
        System.out.println("for object rectanglePerimeter method 'calculateArea()' returns: " + rectanglePerimeter.calculateArea());
        System.out.println("for object rectanglePerimeter method 'calculatePerimeter()' returns: " + rectanglePerimeter.calculatePerimeter());
    }
}
