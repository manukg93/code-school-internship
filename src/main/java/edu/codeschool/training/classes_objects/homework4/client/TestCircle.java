package edu.codeschool.training.classes_objects.homework4.client;
import edu.codeschool.training.classes_objects.homework4.Circle;
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(25.8);
        System.out.println("The raidus of the circle is " + c1.getradius());
        System.out.println("The area of the circle is " + c1.getarea());
        System.out.println("The color of the circle is " + c1.getcolor());
        Circle c2 = new Circle(123456);
        System.out.println("The raidus of the circle is " + c2.getradius());
        System.out.println("The area of the circle is " + c2.getarea());
        System.out.println("The color of the circle is " + c2.getcolor());
        Circle c3 = new Circle(123456);
        System.out.println("The raidus of the circle is " + c3.getradius());
        System.out.println("The area of the circle is " + c3.getarea());
        System.out.println("The color of the circle is " + c3.getcolor());
    }
}
