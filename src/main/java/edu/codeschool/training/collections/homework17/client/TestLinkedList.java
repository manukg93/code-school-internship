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

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("ggg");
        list.add("hhh");

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
        System.out.println();

        //test remove(Object o) method
        list.remove("bbb");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }
        System.out.println();

        // test containsAll(Collection<?> col) method
        List<String> list1 = new LinkedList<>();
        list1.add("aaa");
        list1.add("ccc");
        list1.add("eee");
        System.out.println(list.containsAll(list1));

        // test addAll(Collection<? extends E> var) method
        System.out.println(list.addAll(list1));
        System.out.println("list after adding list1:");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }
        System.out.println();

        // test indexOf(Object obj) method
        System.out.println("index of \"aaa\" object: " + list.indexOf("aaa"));
        System.out.println("index of \"eee\" object: " + list.indexOf("eee"));
        System.out.println("index of \"e\" object: " + list.indexOf("e"));
        System.out.println("index of 12.2 object: " + list.indexOf(12.2));

        // test lastIndexOf(Object obj) method
        System.out.println("Last index of \"aaa\" object: " + list.lastIndexOf("aaa"));
        System.out.println("Last index of \"eee\" object: " + list.lastIndexOf("eee"));
        System.out.println("Last index of \"e\" object: " + list.lastIndexOf("aa"));
        System.out.println("Last index of 12.2 object: " + list.lastIndexOf(12.2));

        // test add(int index, E element) method
        list.add(0, "zzz");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }
        System.out.println();

        list.add(10, "zzz");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }
        System.out.println();


    }
}