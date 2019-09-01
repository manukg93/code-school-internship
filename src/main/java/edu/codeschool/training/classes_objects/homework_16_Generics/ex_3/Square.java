package edu.codeschool.training.classes_objects.homework_16_Generics.ex_3;

public class Square implements Drawable {
    private double side;

    public Square() {
        this.side = 1.0;

    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square with side : "+this.side);
    }
}
