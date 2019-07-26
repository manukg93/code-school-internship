package code.school.internship.classes_and_objects.homework.homework5;


public class TestPersonSubClasses {
    public static void main(String[] args) {
        SubStudent student = new SubStudent("Paul", "Armenia, Yerevan", "State University of Yerevan", 200_000);
        Employee employee = new Employee("Aram", "Armenia, Yerevan", "Beeline", 220_000);

        System.out.println(student.toString());
        System.out.println(employee.toString());
    }
}