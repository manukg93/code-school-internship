package edu.codeschool.training.classes_objects.homework4.homework5;

public class Circle extends Shape {
    double radius;

    public Circle(){
        radius=1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
    public  double getPerimeter(){
        return 3.14 * 2 * radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
//"A Circle with radius=xxx, which is a subclass of yyy"
