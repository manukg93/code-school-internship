package Homework5.TestClassesHomework5;
import Homework5.ClassesHomework5.RectangleShape;
import Homework5.ClassesHomework5.Square;

public class TestShape {
    public static void main(String[] args){
        CircleShape circleShape = new CircleShape(10.1);
        RectangleShape rectangleShape = new RectangleShape(15,20);
        Square square = new Square(5);
        System.out.println(circleShape.toString());
        System.out.println(rectangleShape.toString());
        System.out.println(square.toString());
    }
}
