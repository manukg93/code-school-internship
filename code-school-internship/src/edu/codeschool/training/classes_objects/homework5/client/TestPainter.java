package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.exercise6.*;

public class TestPainter {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Cylinder cylinder = new Cylinder(4.0,5.0);
        Rectangle rectangle = new Rectangle(5.0, 6.0);
        Painter.paint(circle,"green");
        Shape[] shapes = {circle, cylinder, rectangle};
        Painter.paint(shapes,"blue");
    }
}
