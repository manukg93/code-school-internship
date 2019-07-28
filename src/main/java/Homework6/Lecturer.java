package Homework6;

public class Lecturer extends Student {
    public Lecturer(String name, int age, String universityDegree, int grade) {
        super(name, age, universityDegree, grade);
    }
    public String subject() {
        return "Teaching French";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
