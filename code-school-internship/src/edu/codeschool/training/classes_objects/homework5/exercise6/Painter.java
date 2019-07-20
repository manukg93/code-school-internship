package edu.codeschool.training.classes_objects.homework5.exercise6;

public class Painter {
    public static void paint(Shape shape, String color){
        System.out.printf("[Painted shape with name: %s with color: %s, with area: %s ]\n", shape.toString(),color,shape.area());
        System.out.println();
    }
    public static void paint(Shape [] shapes, String color) {
        for (int i = 0; i < shapes.length ; i++) {
            System.out.println("[Painted shape with name: " + shapes[i].toString() + ", with color: " + color + ", with area: " + shapes[i].area() + " ]");
        }
    }
}
