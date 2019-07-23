package edu.codeschool.training.classes_objects.homework4.homework5;

public class Scuare extends Rectangle {
    public Scuare (double side){
        super (side ,side);
    }

    @Override
    public String toString() {
        return "A Scuare with side="+super.width+"  "+super.toString();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
}
