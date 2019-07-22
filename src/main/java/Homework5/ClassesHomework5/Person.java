package Homework5.ClassesHomework5;

abstract class Person {
    String name;
    String adress;
    Person() { // default values
        name = "John";
        adress = "Yerevan, Armenia";
    }
    Person(String name, String adress){
        this.name=name;
        this.adress=adress;
    }

    public String getName() { return name; }
    public String getAdress() { return adress; }
    public void setName(String name) { this.name = name; }
    public void setAdress(String adress) { this.adress = adress; }

    @Override
    public String toString() {
        return " Name: " + name + " Adress: " + adress;
    }
}
