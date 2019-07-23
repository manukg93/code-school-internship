package edu.codeschool.training.classes_objects.homework6.client;

import edu.codeschool.training.classes_objects.homework6.exercise4.*;

public class PersonViewerTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Nikol", "2@1.com","Senat");
        Student student = new Student("Trump","3@1.com","A");
        Lecturer lecturer = new Lecturer("John", "1@1.com", "java");
        PersonViewer personViewer = new PersonViewer();
        SubPersonViewer subPersonViewer = new SubPersonViewer();
        EnhancedPersonViewer enhancedPersonViewer = new EnhancedPersonViewer();

//        personViewer.view(lecturer);
//
//        subPersonViewer.view(lecturer);
//        subPersonViewer.view(student);
//        subPersonViewer.view(employee);

        enhancedPersonViewer.view(employee);
    }
}
