package edu.codeschool.training.classes_objects.homework5;

public class PersonExtendsStudent extends Person{
    private String university;
    private double fee;

    public PersonExtendsStudent(String name, String address, String university, double fee) {
        super(name, address);
        this.university = university;
        this.fee = fee;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString()+" , university is : "+ this.university+" , fee is "+ this.fee +"]";
    }
}
