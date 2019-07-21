package edu.codeschool.training.classes_objects.homework5.exercise_6;

public class TestPainter {
    public static void main(String[] args) {
        Shape[] shape = {new Circle("circle", 5), new Cylinder("cylinder", 2, 3), new Rectangle("rectangle", 1, 2.5)};
        Painter.paint(shape[0],"WHITE");
        Painter.paint(shape[1],"GREY");
        Painter.paint(shape[2],"BLACK");
    }
}
