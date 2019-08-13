package code.school.internship.homework4.client;


import code.school.internship.homework4.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(15.23f, 1.23f);
        Rectangle rectangle2 = new Rectangle(23.00f, 35.12f);
        Rectangle rectangle3 = new Rectangle(12.56f,56.48f);

        rectangle1.setLength(15);
        rectangle1.setWidth(23);

        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());

        System.out.println(rectangle2.calculatePerimeter() + " " + rectangle2.calculateArea() + " " +
                rectangle2.getWidth() + " " + rectangle2.getLength());

        rectangle3.setWidth(45);
        rectangle3.setLength(78);
        System.out.println("width is " + rectangle3.getWidth() + " " + "length is " + rectangle3.getLength() + " " +
                "area is" + rectangle3.calculateArea() + " " + "perimeter is "+ rectangle3.calculatePerimeter());



    }
}
