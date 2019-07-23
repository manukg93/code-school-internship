package edu.codeschool.training.classes_objects.homework6.exercise4;

public class SubPersonViewer extends PersonViewer{

    public void view(Person person)
    {
        if(person instanceof Lecturer){
            System.out.println("Lecturer");
        }else if(person instanceof Student){
            System.out.println("Student");
        }else if(person instanceof Employee){
            System.out.println("Employee");
        }
        System.out.println(person.toString());
        System.out.println(person.getDescription());
        System.out.println();

    }
}
