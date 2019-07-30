package edu.codeschool.training.classes_objects.homework7.exercise2;

import java.util.Arrays;

public class Company {
    private String name;
    private Address addres;
    private Department departments;
    private Contact contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddres() {
        return addres;
    }

    public void setAddres(Address addres) {
        this.addres = addres;
    }

    public Department getDepartments() {
        return departments;
    }

    public void setDepartments(Department departments) {
        this.departments = departments;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Company() {

    }
    public Company(String name, Address addres, Department departments, Contact contact) {
        this.name = name;
        this.addres = addres;
        this.departments = departments;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", addres=" + addres +
                ", departments=" + departments +
                ", contact=" + contact +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
