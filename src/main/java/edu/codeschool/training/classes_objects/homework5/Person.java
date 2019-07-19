package edu.codeschool.training.classes_objects.homework5;

abstract class Person {
    private String name;
    private String address;

    public Person() {
        name = "John";
        address = "Armenia,Yerevan";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
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

    @Override
    public String toString() {
        return super.toString()+"Person[ Name : "+ this.name+" , Address : "+this.address +"";
    }
}

