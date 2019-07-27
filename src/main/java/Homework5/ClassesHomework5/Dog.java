package Homework5.ClassesHomework5;

public class Dog extends Animal {
    String name;
    public Dog (String name){
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Hello " + super.getName());
    }
}
