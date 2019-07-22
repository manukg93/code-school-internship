package edu.codeschool.training.classes_objects.homework6.exercise4;

public class PersonViewerTest {
    public static void main(String[] args) {
        //a. Creates a PersonViewer object using the provided classes.
        Student personViewer1=new Student("Hayk","hayk.serobyan.89@mail.ru","A");
        Lecturer personViewer2=new Lecturer("Biology");
        Employee personViewer3= new Employee("Biology");
        /*b.Creates instances of the Lecturer, Employee and Student classes
        and invokes the view method of the PersonViewer on each of them.*/
        Person [] persons={personViewer1,personViewer2,personViewer3};
        for(int i=0;i<persons.length;i++){
            System.out.println(persons[i].getDescription());

        }

    }
}
