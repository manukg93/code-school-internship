package edu.codeschool.training.classes_objects.homework5;

public class Square extends Rectangle {
    // Constructors
    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    @Override
    public String toString() {
        String squareInfo = "A Square with side " + super.getWidth() + " which is a subclass of " + super.toString();
        return squareInfo;
    }
}
