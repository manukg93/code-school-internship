package edu.codeschool.training.classes_objects.homework6.exercise2;

public class WaterMonster extends AbstractMonster {
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return super.attack()+" water";
    }
}
