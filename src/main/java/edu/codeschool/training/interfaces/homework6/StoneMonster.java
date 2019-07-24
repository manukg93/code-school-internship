package edu.codeschool.training.interfaces.homework6;

public class StoneMonster extends AbstractMonster {

    // Constructor
    public StoneMonster(String name) {
        super(name);
    }

    //
    public String attack() {
        return this.getName();
    }
}
