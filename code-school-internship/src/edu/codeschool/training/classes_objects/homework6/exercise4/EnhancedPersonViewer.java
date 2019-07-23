package edu.codeschool.training.classes_objects.homework6.exercise4;

public class EnhancedPersonViewer extends PersonViewer{
    public void view(Person person)
    {
        String name = person.getName();
        String email = person.getEmail();
        SubPersonViewer subPersonViewer = new SubPersonViewer();

        if(person instanceof Lecturer){
            String subject = ((Lecturer) person).getSubject();
            Student student = new Student(name,email,subject);
            Employee employee = new Employee(name,email,subject);
            subPersonViewer.view(student);
            subPersonViewer.view(employee);
        }else if(person instanceof Student){
            String grade = ((Student) person).getGrade();
            Employee employee = new Employee(name,email,grade);
            Lecturer lecturer = new Lecturer(name,email,grade);
            subPersonViewer.view(lecturer);
            subPersonViewer.view(employee);
        }else if(person instanceof Employee){
            String department = ((Employee) person).getDepartment();
            Student student = new Student(name,email,department);
            Lecturer lecturer = new Lecturer(name,email,department);
            subPersonViewer.view(student);
            subPersonViewer.view(lecturer);
        }
        System.out.println(person.toString());
        System.out.println(person.getDescription());
        System.out.println();

    }
}
