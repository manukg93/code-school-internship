package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.*;

public class TestPainter {
    public static void main(String[] args) {
        AnotherShape[] shapes = {new AnotherCircle("circle1", 4), new AnotherRectangle("rectangle1", 5, 7),
                                 new Cylinder("cylinder1", 3.2, 1.5)};

        Painter.paint(shapes, "blue");
    }
}
