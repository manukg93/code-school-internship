package edu.codeschool.training.classes_objects.homework4.client;
import edu.codeschool.training.classes_objects.homework4.homework5.Students;
import edu.codeschool.training.classes_objects.homework4.homework5.Employee;
public class TestPersonSubClasses {
    public static void main(String[] args) {

        Students st = new Students("Hamo","Armenia Erevan","EPH",150000);
        Employee em = new Employee("Oracle",400000);
        System.out.println(st.toString());
        System.out.println(em.toString());

    }
}