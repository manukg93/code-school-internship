package Homework5.ClassesHomework5;

public class Cat extends Animal {
    String name;
    public Cat(String name){
        this.name="Akita";
    }

    @Override
    public void greeting() {
        System.out.println(super.getName());
    }
}
