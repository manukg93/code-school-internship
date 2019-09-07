package edu.codeschool.training.collections.homework17;

import java.util.*;

public class LinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;
    private int position = 0;

    // default constructor
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return (this.size() == 0);
    }

    @Override
    public boolean contains(Object value) {
        return (this.indexOf(value) >= 0);
    }

    @Override
    public Iterator<E> iterator() {
        return this.iterator();
    }

    @Override
    public boolean add(E value) {
        Node nextNode = new Node<>(value);
        this.tail.setLink(nextNode);
        this.tail = nextNode;
        this.size++;
        if (this.head == null) {
            this.head = nextNode;
        }
        return true;
    }

    @Override
    public int indexOf(Object value) {

        if (this.size == 0) {return -1;}

        Node node = this.head;
        int index = 0;

        while (node != tail) {
            if (value == node.getValue()) {
                return index;
            }
            node = node.getLink();
            index++;
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object value) {
        return  -1;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node node = this.head;
        int i = 0;
        while (node != tail) {
            array[i++] = node.getValue();
            node = node.getLink();
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] var1) {
        return null;
    }

    @Override
    public boolean remove(Object value) {
        Node node = this.head;
        while (node != tail) {
            if (value == node.getValue()) {

            }
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> var1) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> var1) {
        return false;
    }

    @Override
    public boolean addAll(int var1, Collection<? extends E> var2) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> var1) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> var1) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object var1) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public E get(int var1) {
        E e = null;
        return e;
    }

    @Override
    public E set(int var1, E var2) {
        E e = null;

        return e;
    }

    @Override
    public void add(int var1, E var2) {

    }

    @Override
    public E remove(int var1) {
        E e = null;
        return e;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int var1) {
        return null;
    }

    @Override
    public List<E> subList(int var1, int var2) {
        return null;
    }
}
