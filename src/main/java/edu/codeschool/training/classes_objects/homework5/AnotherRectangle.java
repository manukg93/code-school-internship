package edu.codeschool.training.classes_objects.homework5;

public class AnotherRectangle extends AnotherShape {
    private double length;
    private double width;

    // Constructors
    public AnotherRectangle() {
        length = 1.0;
        width = 1.0;
    }

    public AnotherRectangle(String name, double length, double width) {
        super(name);

        if (length < 0) {
            System.out.println("Length of Rectangle must be positive.");
            this.length = 1.0;
            return;
        }
        this.length = length;

        if (width < 0) {
            System.out.println("Width of Rectangle must be positive.");
            this.width = 1.0;
            return;
        }
        this.width = width;
    }

    // Getters and setters
    public void setLength(double length) {
        if (length < 0) {
            System.out.println("Length of Rectangle must be positive.");
            this.length = 1.0;
            return;
        }
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width < 0) {
            System.out.println("Length of Rectangle must be positive.");
            this.width = 1.0;
            return;
        }
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double area() {
        return length * width;
    }

}
