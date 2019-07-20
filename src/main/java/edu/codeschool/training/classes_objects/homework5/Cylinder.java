package edu.codeschool.training.classes_objects.homework5;

public class Cylinder extends AnotherShape {
    private double radius;
    private double height;

    // Constructors
    public Cylinder() {
        this.radius = 1.0;
        this.height = 1.0;
    }

    public Cylinder(String name, double radius, double height) {
        super(name);

        if (radius < 0) {
            System.out.println("Radius of Cylinder must be positive.");
            this.radius = 1.0;
            return;
        }
        this.radius = radius;

        if (height < 0) {
            System.out.println("Height of Cylinder must be positive.");
            this.height = 1.0;
            return;
        }
        this.height = height;
    }

    // Getters and setters
    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Radius of Cylinder must be positive.");
            this.radius = 1.0;
            return;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setHeight(double height) {
        if (height < 0) {
            System.out.println("Height of Cylinder must be positive.");
            this.height = 1.0;
            return;
        }
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double area() {
        return Math.PI * this.height * this.radius * this.radius;
    }

}
