package edu.codeschool.training.interfaces.homework6;

public class WaterMonster extends AbstractMonster {

    // Constructor
    public WaterMonster(String name) {
        super(name);
    }

    //
    public String attack() {
        return this.getName();
    }
}
