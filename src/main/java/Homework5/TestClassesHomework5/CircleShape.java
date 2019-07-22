package Homework5.TestClassesHomework5;

import Homework5.ClassesHomework5.Shape;

public class CircleShape extends Shape {
    public double radius;
    public CircleShape() {
        radius = 1.0;
    }
    public CircleShape(double radius){
        if(radius < 0){
            radius=1.0;
            return;
        }
        this.radius=radius;
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getPerimeter() { return 2*radius*Math.PI; }

    @Override
    public String toString() {
        String result;
        result = "A Circle with radius=" + radius + " which is a subclass of " + super.toString();
        return result;
    }
}
