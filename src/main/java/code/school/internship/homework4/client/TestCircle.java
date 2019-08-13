package code.school.internship.homework4.client;


import code.school.internship.homework4.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15,"blue");

        circle2.setRadius(15);
        circle3.setColor("blue");
        System.out.println(circle2.getRadius() + " " + circle2.getColor());
        System.out.println(circle1.getColor() + " " + circle1.getRadius());
        System.out.println(circle3.getColor() + " " + circle3.getRadius());



    }
}
