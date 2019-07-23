package edu.codeschool.training.classes_objects.homework4.homework5;

import java.util.Date;

public class Student {
    private String name;
    private int age;
    private Date  birthDate;
    static int count=0;

    public static int getCount() {
        return count;
    }

    public Student(){

    }


    public Student(String name, int age, Date birthDate){
        this.name=name;
        this.age=age;
        this.birthDate=birthDate;
        count++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String toString() {
        return "Student[ " + this.name+" "+this.age+" "+this.birthDate+" ]";
    }
}
