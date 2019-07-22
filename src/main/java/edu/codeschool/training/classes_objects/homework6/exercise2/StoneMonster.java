package edu.codeschool.training.classes_objects.homework6.exercise2;

public class StoneMonster extends AbstractMonster {
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return super.attack()+" stone";
    }
}

