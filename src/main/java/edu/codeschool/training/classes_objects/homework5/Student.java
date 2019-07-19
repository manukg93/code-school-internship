package edu.codeschool.training.classes_objects.homework5;

import java.util.Date;

public class Student {
    static int count = 0;

    private String name;
    private int age;
    private Date birthDate;

    // Constructors
    public Student(String name, int age, Date birthDate) {
        if (name != null) {
            this.name = name;
        }

        if (age < 0) {
            System.out.println("Age of the student must be positiv value.");
            this.age = 0;
        }
        this.age = age;

        if (birthDate != null) {
            this.birthDate = birthDate;
        }
        count++;
    }

    // Setters and getters
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age of the student must be positiv value.");
            this.age = 0;
        }
    }

    public void setBirthDate(Date birthDate) {
        if (birthDate != null) {
            this.birthDate = birthDate;
        }
    }

    // Public methods
    public static int getCount() {
        return count;
    }
    public String toString() {
        String strStudent = super.toString() + "\nStudent: [Name:" + name + ", Age:" + age + ", Date Of Birth:" + birthDate.toString() + "]";
        return strStudent;
    }

}
