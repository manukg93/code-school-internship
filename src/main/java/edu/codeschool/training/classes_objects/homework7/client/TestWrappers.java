package edu.codeschool.training.classes_objects.homework7.client;

import edu.codeschool.training.classes_objects.homework7.wrappers.Boolean;
import edu.codeschool.training.classes_objects.homework7.wrappers.Character;
import edu.codeschool.training.classes_objects.homework7.wrappers.Double;
import edu.codeschool.training.classes_objects.homework7.wrappers.Integer;

public class TestWrappers {
    public static void main(String[] args) {
        // doubles
        Double doubleNumber1 = new Double();
        System.out.println(doubleNumber1.getValue());

        doubleNumber1.setValue(5.5);
        System.out.println(doubleNumber1.getValue());

        Double doubleNumber2 = new Double(85.999999999);
        System.out.println(doubleNumber2.getValue());

        // characters
        Character character1 = new Character();
        System.out.println(character1.getCharacter());

        Character character2 = new Character(65);
        System.out.println(character2.getCharacter());

        character2.nextCharacter();
        System.out.println(character2.getCharacter());

        // booleans
        Boolean bool1 = new Boolean();

        Boolean bool2 = new Boolean(true);

        System.out.println(bool1.not().and(bool2).isValue());

        // integers
        Integer int1 = new Integer(220_220);
        System.out.println(int1.toString());
        System.out.println(int1.toString().length());

        System.out.println(int1.byteValue());
        System.out.println(int1.shortValue());
        System.out.println(int1.intValue());
        System.out.println(int1.longValue());

        Integer i = new Integer();
        System.out.println(i.parseInt("1154"));
        i.parseInt("12b78");


    }
}
