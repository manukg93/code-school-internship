package edu.codeschool.training.classes_objects.homework5;

public class AnotherCircle extends AnotherShape {
    private double radius;

    // Constructors
    public AnotherCircle() {
        radius = 1.0;
    }

    public AnotherCircle(String name, double radius) {
        super(name);
        if (radius < 0) {
            System.out.println("Radius must be positive.");
            this.radius = 1.0;
            return;
        }
        this.radius = radius;
    }

    // Setters and getters
    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Radius of Circle must be positive.");
            this.radius = 1.0;
            return;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
