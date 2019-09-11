package edu.codeschool.training.collections.homework17.client;

import edu.codeschool.training.collections.homework17.linked_list.LinkedList;
import edu.codeschool.training.collections.homework17.linked_list.LinkedListIterator;

import java.util.Iterator;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        System.out.println("List is empty: " + list.isEmpty());
        System.out.println("Size of list: " + list.size());

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println("List is empty: " + list.isEmpty());
        System.out.println("Size of list: " + list.size());

        Object[] listArray = list.toArray();
        System.out.println("Array of list elements");
        for ( Object el : listArray ) {
            System.out.print(el + ",");
        }
        System.out.println();

        System.out.print("print list's elements using iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }
    }
}