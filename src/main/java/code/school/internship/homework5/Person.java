package code.school.internship.homework5;

public abstract class Person {
    String name = "John";
    String address = "Armenia Yerevan ";

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return super.toString();
    }  
}

