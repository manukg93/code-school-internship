package edu.codeschool.training.interfaces.homework6.client;

import edu.codeschool.training.interfaces.homework6.Employee;
import edu.codeschool.training.interfaces.homework6.Lecturer;
import edu.codeschool.training.interfaces.homework6.PersonViewer;
import edu.codeschool.training.interfaces.homework6.Student;

public class PersonViewerTest {
    public static void main(String[] args) {

        PersonViewer personViewer = new Student("Paul Smith", "aaa@gmail.com", 'B');
        personViewer.view();

        personViewer = new Employee("John", "bbb@gmail.com", "Finances");
        personViewer.view();

        personViewer = new Lecturer("Aram Martirosyan", "aram@gmail.com", "Mathematics");
        personViewer.view();
    }
}
