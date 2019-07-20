package edu.codeschool.training.classes_objects.homework5;

public class Rectangle extends Shape {
    public double width;
    public double length;

    // Constructors
    public Rectangle() {
        width = length = 1.0;
    }

    public Rectangle(double width, double length) {
        if (width < 0) {
            System.out.println("Width of rectangle cannot be negative value");
            this.width = 1.0;
            return;
        }
        this.width = width;

        if (length < 0) {
            System.out.println("Length of rectangle cannot be negative value");
            this.length = 1.0;
            return;
        }
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);

        if (width < 0) {
            System.out.println("Width of rectangle cannot be negative value");
            this.width = 1.0;
            return;
        }
        this.width = width;

        if (length < 0) {
            System.out.println("Length of rectangle cannot be negative value");
            this.length = 1.0;
            return;
        }
        this.length = length;
    }

    // Getters and setters
    public void setWidth(double width) {
        if (width < 0) {
            System.out.println("Width of rectangle cannot be negative value");
            this.width = 1.0;
            return;
        }
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length < 0) {
            System.out.println("Length of rectangle cannot be negative value");
            this.length = 1.0;
            return;
        }
        this.length = length;
    }

    private double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        String rectInfo = "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
        return rectInfo;
    }
}
