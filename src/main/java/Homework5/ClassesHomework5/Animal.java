package Homework5.ClassesHomework5;

public abstract class Animal {
    private String name;
    abstract public void greeting();
    public Animal(){
        name="Animal";
    }
    public Animal(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal Name: " + name;
    }
}
