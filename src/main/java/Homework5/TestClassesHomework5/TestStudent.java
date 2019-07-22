package Homework5.TestClassesHomework5;
import Homework5.ClassesHomework5.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student ("Mane", 25, 45644654);
        Student student1 = new Student ("Franck", 35, 65654);
        Student student2 = new Student ("Arnaud Marin", 33, 654654);
        System.out.println(Student.getNumberOfObjects());
        System.out.println(student1.toString());
    }
}
