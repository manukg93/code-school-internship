package edu.codeschool.training.collections.homework17.array_list;

import java.util.NoSuchElementException;

public class CustomListIterator<E> implements java.util.ListIterator<E> {

    private E[] array;
    private int size;
    private int current;

    public CustomListIterator(E[] array, int size) {
        this.array = array;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return current < size;
    }

    @Override
    public E next() {
        if (current < size) {
            return this.array[current++];
        }
        throw new NoSuchElementException();
    }

    @Override
    public boolean hasPrevious() {
        return this.current > 0;
    }

    @Override
    public E previous() {
        if (this.current > 0) {
            return this.array[current--];
        }
        throw new NoSuchElementException("No previous element");
    }

    @Override
    public int nextIndex() {
        return this.current < this.size? this.current++ : this.size;
    }

    @Override
    public int previousIndex() {
        return this.current == 0 ? -1 : this.current - 1;
    }

    @Override
    public void remove() {
    }

    @Override
    public void set(E o) {
    }

    @Override
    public void add(Object o) {

    }
}
