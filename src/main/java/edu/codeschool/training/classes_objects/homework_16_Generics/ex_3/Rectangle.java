package edu.codeschool.training.classes_objects.homework_16_Generics.ex_3;

public class Rectangle implements Drawable {
    private double length;
    private double  width;

    public Rectangle() {
        this.length = 1;
        this.width = 2;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with length : "+this.length+ "& width : "+this.width );
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
