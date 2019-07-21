package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.Circle;
import edu.codeschool.training.classes_objects.homework5.Square;

public class TestShape {
    public static void main(String[] args) {
        Circle TestCircle = new Circle(5.7);
        System.out.println(TestCircle.toString());

        Square TestSquare1 = new Square(4.2);
        System.out.println(TestSquare1.toString());

        Square  TestSquare2= new Square("white", true, 5.6);
        System.out.println(TestSquare2.toString());
        System.out.println(TestSquare1.getArea());
        System.out.println(TestSquare2.getPerimeter());
    }

}
