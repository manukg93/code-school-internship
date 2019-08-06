package Homework8;

import java.util.Arrays;
import java.util.Locale;

public class CustomString {
    private char[] characters;

    public CustomString(char[] characters) {
        this.characters = characters;
    }

    public char charAt(int index) {
        for (int i = 0; i < characters.length; i++) {
            if (i == index)
            return characters[i];
        }
        return 0;
    }
    public boolean contains(CharSequence s) {
        return false;
    }
    public Locale toUpperCase(Locale locale){
        return null;
    }
    public int length(){
        return characters.length;
    }
    public int indexOf(int ch){
        return 0;
    }
    public int lastIndexOf(int ch){
        return 0;
    }
    public boolean startsWith(String prefix){
        return false;
    }
    public boolean endsWith(String suffix){
        return false;
    }
    public String revers(){
        return null;
    }

    public char[] getCharacters() {
        return characters;
    }

    public void setCharacters(char[] characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return characters + Arrays.toString(characters);
    }
}
