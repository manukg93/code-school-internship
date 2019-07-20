package edu.codeschool.training.classes_objects.homework5;

public class Circle extends Shape {
    public double radius;

    // Constructors
    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        if (radius < 0) {
            System.out.println("Radius should be positive");
            radius = 1.0;
            return;
        }
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);

        if (radius < 0) {
            System.out.println("Radius should be positive");
            this.radius = 1.0;
            return;
        }
        this.radius = radius;
    }

    // Getters and setters
    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Radius should be positive");
            this.radius = 1.0;
            return;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        String circleInfo = "A Circle with radius = " + radius + " which is a subclass of " + super.toString();
        return circleInfo;
    }
}
