package code.school.internship.classes_and_objects.state_and_behaviour;// Class Declaration

public class Dog {
    // Instance Variables (class fields, Object state)
    private String name;
    private int age;
    private String color;

    // Constructor Declaration of Class
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // method 1
    public String getName() {
        return name;
    }

    // method 3
    public int getAge() {
        return age;
    }

    // method 4
    public String getColor() {
        return color;
    }

    public void eat(String something){
        System.out.println("Dog is eating " + something);
    }

    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    @Override
    public String toString() {
        return ("Hi my name is " + this.getName()
                + ".\nMy age and color are "
                + this.getAge() + ","
                + this.getColor());
    }
} 
