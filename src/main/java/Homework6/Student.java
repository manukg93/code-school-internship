package Homework6;

public class Student extends Person{

public Student(String name, int age, String universityDegree, int grade){
    super(name, age, universityDegree, grade);
}
    @Override
    public String toString() {
    System.out.println("Personal information ");
        return name + " " + age + " " + universityDegree + " " + grade;
    }
}
