package Homework6;

public abstract class Person {
    public String name;
    public int age;
    public String universityDegree;
    public int grade;

    Person(String name, int age, String universityDegree, int grade) {
        this.name = name;
        this.age = age;
        this.universityDegree = universityDegree;
        this.grade= grade;
    }

    protected Person() {
    }
}
