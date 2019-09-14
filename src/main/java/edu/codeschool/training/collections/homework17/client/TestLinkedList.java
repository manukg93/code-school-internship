package edu.codeschool.training.collections.homework17.client;

import edu.codeschool.training.collections.homework17.linked_list.LinkedList;
import edu.codeschool.training.collections.homework17.linked_list.LinkedListIterator;

import java.util.Iterator;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        List<Character> chars1 = new LinkedList<>();
        chars1.add('a');
        chars1.add('b');
        chars1.add('c');
        chars1.add('d');
        System.out.println(chars1);
        List<Character> chars2 = new LinkedList<>();
        chars2.add('1');
        chars2.add('2');
        chars2.add('3');
        System.out.println(chars2);
        System.out.println(chars2.size());
        chars1.addAll(3, chars2);
        System.out.println(chars1);
    }
}