package edu.codeschool.training.interfaces.homework6.client;

import edu.codeschool.training.interfaces.homework6.*;

public class PersonViewerTest {
    public static void main(String[] args) {

        PersonViewer personViewer = new PersonViewer();
        SubPersonViewer subPersonViewer = new SubPersonViewer();

        Student student = new Student("Anna", "anna@gmail.com", 'D');
        Employee employee = new Employee("Armen", "armen@gmail.com", "Finances");
        Lecturer lecturer = new Lecturer("Anahit", "anahit@gmail.com", "English");

        //personViewer.view(student);
        //personViewer.view(employee);
        //personViewer.view(lecturer);

        //subPersonViewer.view(student);
        //subPersonViewer.view(employee);
        //subPersonViewer.view(lecturer);

        subPersonViewer.viewPerson(student);
        System.out.println();

        subPersonViewer.viewPerson(employee);
        System.out.println();

        subPersonViewer.viewPerson(lecturer);

    }
}
