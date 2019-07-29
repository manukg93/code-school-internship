package edu.codeschool.training.classes_objects.homework7.wrappers;

public class Character {
    public static final int SIZE = 16;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 65536; // unsigned

    private char value;

    // Constructors

    // Default constructor
    public Character() {
        this.value = (char) 0;
    }

    // Constructors with parameters
    public Character(char character) {
        if ((character > MAX_VALUE) || (character < MIN_VALUE)) {
            this.value = 0;
        } else {
            this.value = character;
        }
    }

    public Character(int decimalRepresentation) {
        if ((decimalRepresentation > MAX_VALUE) || (decimalRepresentation < MIN_VALUE)) {
            this.value = 0;
        } else {
            this.value = (char) decimalRepresentation;
        }
    }

    // Setter
    public void setCharacter(char character) {
        if ((character > MAX_VALUE) || (character < MIN_VALUE)) {
            this.value = 0;
        } else {
            this.value = character;
        }
    }

    // Getter
    public char getCharacter() {
        return this.value;
    }

    // Public methods
    public char charValue() {
        return (char) this.value;
    }

    // Get decimal representation of character
    public int intValue() {
        return (int) this.value;
    }

    // Increment for characters
    public void nextCharacter() {
        if (this.value < MAX_VALUE) {
            ++this.value;
        }
    }

    // Decrement for characters
    public void previousCharacter() {
        if (this.value > 0) {
            --this.value;
        }
    }
}
