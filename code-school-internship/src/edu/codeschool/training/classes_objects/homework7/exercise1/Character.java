package edu.codeschool.training.classes_objects.homework7.exercise1;

public class Character {
    private Character character;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Character(Character character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "Character{" +
                "character=" + character +
                '}';
    }


}
