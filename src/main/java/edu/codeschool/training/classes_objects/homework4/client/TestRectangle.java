package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Rectangle;

public class TestRectangle {
    public static void main (String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(1.7f);
        Rectangle rect3 = new Rectangle(1.7f, 1.2f);

        System.out.println("Rectangle1 length: " + rect1.getLength());
        System.out.println("Rectangle1 width: " + rect1.getWidth());
        System.out.println("Rectangle1 area: " + rect1.calculateArea());
        System.out.println("Rectangle1 perimeter: " + rect1.calculatePerimeter());
        System.out.println();

        System.out.println("Rectangle2 length: " + rect2.getLength());
        System.out.println("Rectangle2 width: " + rect2.getWidth());
        System.out.println("Rectangle2 area: " + rect2.calculateArea());
        System.out.println("Rectangle2 perimeter: " + rect2.calculatePerimeter());
        System.out.println();

        System.out.println("Rectangle3 length: " + rect3.getLength());
        System.out.println("Rectangle3 width: " + rect3.getWidth());
        System.out.println("Rectangle3 area: " + rect3.calculateArea());
        System.out.println("Rectangle3 perimeter: " + rect3.calculatePerimeter());
        System.out.println();

        rect3.setLength(3.4f);
        rect3.setWidth(2.2f);

        System.out.println("Rectangle3 length: " + rect3.getLength());
        System.out.println("Rectangle3 width: " + rect3.getWidth());
        System.out.println("Rectangle3 area: " + rect3.calculateArea());
        System.out.println("Rectangle3 perimeter: " + rect3.calculatePerimeter());
        System.out.println();

        rect2.setWidth(-1.2f);
        rect2.setLength(-5.6f);

    }
}
