package edu.codeschool.training.classes_objects.homework_16_Generics.ex_3;

public class Circle implements Drawable {
    private double radius;
    final double PI=3.14159;

    public Circle() {
        this.radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle with radius "+this.radius);
    }
}
