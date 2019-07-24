package edu.codeschool.training.interfaces.homework6;

public class FireMonster extends AbstractMonster {

    // Constructor
    public FireMonster(String name) {
        super(name);
    }

    // implement attack() method
    public String attack() {
        return this.getName();
    }
}
