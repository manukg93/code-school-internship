package edu.codeschool.training.classes_objects.homework6.exercise2;

public abstract class AbstractMonster implements Monster {
    private  String name;


    public AbstractMonster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String attack() {
        return "I can attack by";
    }
}
