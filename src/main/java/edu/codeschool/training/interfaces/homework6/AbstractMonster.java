package edu.codeschool.training.interfaces.homework6;

abstract public class AbstractMonster implements Monster{
    String name;

    // Constructors
    public AbstractMonster() {
        this.name = "Abstract monster";
    }

    public AbstractMonster(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    // Setter
    void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    // Getter
    String getName() {
        return this.name;
    }
}
