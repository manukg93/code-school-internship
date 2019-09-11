package edu.codeschool.training.collections.homework17.linked_list;

import java.util.Iterator;

public class LinkedListIterator<E> implements Iterator<E> {
    private LinkedList<E> linkedList;
    private Node next;
    private int count = 0;

    // constructor
    public LinkedListIterator(LinkedList<E> linkedList) {
        if (linkedList == null) {
            this.linkedList = null;
            return;
        }
        this.linkedList = linkedList;
        this.next = this.linkedList.getHead();
    }

    @Override
    public boolean hasNext() {
        return this.count < this.linkedList.size();
    }

    @Override
    public E next() {
        E element = (E) this.next.getValue();
        this.next = this.next.getNext();
        this.count++;
        return element;
     }
}
