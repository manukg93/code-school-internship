package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.Circle;
import edu.codeschool.training.classes_objects.homework5.Rectangle;

public class TestShape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("red", false, 12, 34);
        System.out.println(rect.toString());

        Circle circle = new Circle(9.8);
        System.out.println(circle.toString());
    }
}
