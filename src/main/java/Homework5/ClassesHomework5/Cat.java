package Homework5.ClassesHomework5;

public class Cat extends Animal {
    String name;
    public Cat(String name){
       super(name);
    }
    @Override
    public void greeting() {
        System.out.println("Hello " + super.getName());
    }
}
