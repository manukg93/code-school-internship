package edu.codeschool.training.classes_objects.homework5;

public abstract class Person {
    private String name = "John";
    private String address = "Armenia,Yerevan";

    public Person(){
    };
    public Person(String name,String address){
        this.name=name;
        this.address=address;
    }

    @Override
    public String toString() {
        return " Person [Name:" + this.name + ", Address:" + this.address + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
