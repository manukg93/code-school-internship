package edu.codeschool.training.classes_objects.homework7.client;

import edu.codeschool.training.classes_objects.homework7.wrappers.Boolean;
import edu.codeschool.training.classes_objects.homework7.wrappers.Character;
import edu.codeschool.training.classes_objects.homework7.wrappers.Double;
import edu.codeschool.training.classes_objects.homework7.wrappers.Integer;

public class TestWrappers {
    public static void main(String[] args) {
        // doubles
        System.out.println("DOUBLES");
        Double doubleNumber1 = new Double();
        System.out.println("Default value of doubles: " + doubleNumber1.getValue());

        doubleNumber1.setValue(5.5);
        System.out.println("Double1: " + doubleNumber1.getValue());

        Double doubleNumber2 = new Double(85.999999999);
        System.out.println("Double2: " + doubleNumber2.getValue());

        System.out.println("Sum of double1 and double2: " + doubleNumber1.plus(doubleNumber2).getValue());
        System.out.println();

        // characters
        System.out.println("CHARACTERS");
        Character character1 = new Character();

        char[] characters = Character.parseString("Java 8");
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i] + " ");
        }
        System.out.println();

        System.out.println(Character.parseSymbol("7"));

        Character character2 = new Character(65);
        System.out.println(character2.getCharacter());
        System.out.println(character2);

        character2.nextCharacter();
        System.out.println(character2.getCharacter());

        // booleans
        Boolean bool1 = new Boolean();

        Boolean bool2 = new Boolean(true);
        System.out.println(bool2);

        System.out.println(bool1.not().and(bool2).isValue());

        // integers
        Integer int1 = new Integer(220_220);
        System.out.println(int1.toString());
        System.out.println(int1.toString().length());

        System.out.println(int1.byteValue());
        System.out.println(int1.shortValue());
        System.out.println(int1.intValue());
        System.out.println(int1.longValue());

        System.out.println(Integer.parseInt("1154"));
        Integer.parseInt("12b78");
        System.out.println(Integer.parseInt("5"));
    }
}
