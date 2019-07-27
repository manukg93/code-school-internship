package edu.codeschool.training.interfaces.homework6;

public class SubPersonViewer extends PersonViewer {

    @Override
    public void view(Human human) {
        if (human instanceof Student) {
            Student st = (Student) human;
            System.out.println("The person is student");
        }

        if (human instanceof Employee) {
            Employee emp = (Employee) human;
            System.out.println("The person is employee");
        }

        if (human instanceof Lecturer) {
            Lecturer lect = (Lecturer) human;
            System.out.println("The person is lecturer");
        }
    }

    public void viewPerson(Student st) {
        view(st);
        st.getDescription();
    }

    public void viewPerson(Employee emp) {
        view(emp);
        emp.getDescription();
    }

    public void viewPerson(Lecturer lect) {
        view(lect);
        lect.getDescription();
    }
}
