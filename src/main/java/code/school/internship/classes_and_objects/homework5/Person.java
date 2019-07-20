package code.school.internship.classes_and_objects.homework5;

abstract public class Person {
    public String name;
    public String address;

    {
        name = "John";
        address = "Armenia, Yerevan";
    }

    // Constructors
    // Default constructor
    public Person() {
        name = "";
        address = "";
    }
    // Constructor with parameters
    public Person(String name, String address) {
        if (name != null) {
            this.name = name;
        }
        if (address != null) {
            this.address = address;
        }
    }

    // Getters and setters
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
        String strPerson = "[Name:" + name + ", Address:" + address + "]";
        return strPerson;
    }
}
