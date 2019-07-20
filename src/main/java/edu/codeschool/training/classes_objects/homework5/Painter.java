package edu.codeschool.training.classes_objects.homework5;

public class Painter {

    public static void paint(AnotherShape shape, String color) {
        String paintedShape = "[Painted shape with name: " + shape.getShapeName() + ", with color: " + color +
                                ", with area: " + shape.area() + "]";
        System.out.println(paintedShape);
    }

    public static void paint(AnotherShape[] shapes, String color) {
        for (int i = 0; i < shapes.length; i ++) {
            String paintedShape = "[Painted shape with name: " + shapes[i].getShapeName() + ", with color: " + color +
                    ", with area: " + shapes[i].area() + "]";
            System.out.println(paintedShape);
        }
    }
}
