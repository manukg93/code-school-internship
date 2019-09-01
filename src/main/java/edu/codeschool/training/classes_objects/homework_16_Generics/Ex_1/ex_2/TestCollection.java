package edu.codeschool.training.classes_objects.homework_16_Generics.Ex_1.ex_2;

import java.util.Arrays;

public class TestCollection {
    public static void main(String[] args) throws CollectionIsFullException, IndexOutOfBoundsException {
        Collection<String> str=new Collection<>(5);
        System.out.println(str);
        str.addElement("Erevan");
        str.addElement("Vanadzor");
        str.addElement("Armavir");
        str.addElement("Gyumri");
        str.addElement("Tashir");
        //System.out.println(str.getIndex(2));
        //System.out.println(str.isEmpty());
        //System.out.println(str.containsElement("Hamo"));
        //System.out.println(str.size());
        str.removeElement("Vanadzor");
        System.out.println(str);


    }
}
