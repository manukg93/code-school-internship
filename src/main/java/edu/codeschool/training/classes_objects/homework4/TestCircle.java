package edu.codeschool.training.classes_objects.homework4;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"blue");
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle();

        System.out.println(circle.toString());
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
    }
}
