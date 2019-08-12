package code.school.internship.classes_and_objects.homework.homework4;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6.1f);
        Rectangle rectangle1 = new Rectangle(2.9f, 2.5f);
        System.out.println(rectangle.toString());
        System.out.println(rectangle1.toString());

        rectangle.setLength(4.5f);
        rectangle.setWidth(5.5f);
        rectangle1.setLength(6.5f);
        rectangle1.setWidth(6.6f);
        System.out.println(rectangle.toString());
        System.out.println(rectangle1.toString());
    }
}
