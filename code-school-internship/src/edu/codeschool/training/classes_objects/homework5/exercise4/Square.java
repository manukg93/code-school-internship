package edu.codeschool.training.classes_objects.homework5.exercise4;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    @Override
    public String toString() {
        String toStringShape = super.toString();

        return "A Square with side=" + this.getWidth() +", which is a subclass of " + toStringShape;
    }
}
