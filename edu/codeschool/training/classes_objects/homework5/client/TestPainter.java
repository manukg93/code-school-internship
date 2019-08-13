package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.*;
import edu.codeschool.training.classes_objects.homework5.AnotherCircle;
import edu.codeschool.training.classes_objects.homework5.AnotherRectangle;
import edu.codeschool.training.classes_objects.homework5.AnotherShape;
import edu.codeschool.training.classes_objects.homework5.Cylinder;
import edu.codeschool.training.classes_objects.homework5.Painter;

public class TestPainter {
    public static void main(String[] args) {
        AnotherShape[] shapes = {new AnotherCircle("circle1", 4), new AnotherRectangle("rectangle1", 5, 7),
                                 new Cylinder("cylinder1", 3.2, 1.5)};

        Painter.paint(shapes, "blue");
    }
}
