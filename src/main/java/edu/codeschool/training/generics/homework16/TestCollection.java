package edu.codeschool.training.generics.homework16;

public class TestCollection {

    public static void main(String[] args) {

        // create collection of Characters
        Collection<Character> charCollection = new Collection<Character>(10);
        System.out.println("capacity: " + charCollection.length());

        try {
            charCollection.add('a');
            charCollection.add('a');

        } catch (CollectionIsFullException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("number of elements: " + charCollection.size());

        try {
            System.out.println(charCollection.getElementAtIndex(-8));

        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        // create collection of Integers
        Collection<Integer> integerCollection = new Collection<>(20);
        System.out.println("is integer collection empty: " + integerCollection.isEmpty());

        integerCollection.add(11);
        integerCollection.add(22);
        integerCollection.add(33);
        integerCollection.add(44);
        integerCollection.add(55);

        System.out.println(integerCollection.getElementAtIndex(2));
        try {
            System.out.println(integerCollection.getElementAtIndex(21));

        } catch (IndexOutOfBoundsException ex) {

            System.out.println(ex.getMessage());
        }

        System.out.println(charCollection);
    }
}
