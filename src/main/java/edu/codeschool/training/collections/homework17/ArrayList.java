package edu.codeschool.training.collections.homework17;

import java.util.*;
import java.util.function.Predicate;

public class ArrayList<E> implements java.util.List<E> {

    private final int DEFAULT_SIZE = 10;
    private E[] array;
    private int countOfElements = 0;

    // default constructor
    public ArrayList() {
        this.array = (E[]) new Object[DEFAULT_SIZE];
    }

    // parameterized constructor
    public ArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity: " + capacity);
        }
        this.array = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return this.countOfElements;
    }

    @Override
    public boolean isEmpty() {
        return (this.size() == 0);
    }

    @Override
    public void clear() {
        if (this.size() != 0) {
            for (E element : this.array ) {
                element = null;
            }
        }
        this.countOfElements = 0;
    }

    @Override
    public boolean contains(Object obj) {
        if (this.indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(Object obj) {
        for (int i = 0; i < this.size(); i++) {
            if (obj.equals(this.array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        for (int i = this.size() - 1; i >= 0; i--) {
            if (obj.equals(this.array[i])) {
                return i;
            }
        }
        return -1;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Not valid index: " + index);
        }
    }
    @Override
    public E get(int index) {
        this.checkIndex(index);
        return this.array[index];
    }

    @Override
    public boolean add(E e){
        if (this.array == null) {
            return false;
        }
        if (this.countOfElements >= this.array.length) {
            E[] copyArray =(E[]) new Object[this.array.length * 2];
            for(int i = 0; i < this.array.length; i++) {
                copyArray[i] = this.array[i];
                this.array = copyArray;
            }
        }
        this.array[countOfElements++] = e;
        return true;
    }

    @Override
    public void add(int index, E obj) {
        if (this.array == null) {
            System.out.println("No array list.");
            return;
        }
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException("Not valid index: " + index);
        }
        if (index == this.size()) {
            this.array[index] = obj;
        } else {
            for (int i = this.size(); i >= index; i--) {
                this.array[i] = this.array[i - 1];
            }
            this.array[index] = obj;
            this.countOfElements++;
        }
    }

    @Override
    public E set(int index, E e) {
        this.checkIndex(index);
        this.array[index] = e;
        return e;
    }

    @Override
    public boolean remove(Object obj) {
        int index = this.indexOf(obj);

        if (index >= 0) {
            this.array[index] = null;
            for (int i = index+1; i < this.size(); i++) {
                this.array[i-1] = this.array[i];
            }
            this.countOfElements--;
            return true;
        }
        return false;
    }

    @Override
    public E remove(int index) {
        this.checkIndex(index);
        E obj = this.array[index];
        this.array[index] = null;
        for (int i = index+1; i < this.size(); i++) {
            this.array[i-1] = this.array[i];
        }
        this.countOfElements--;

        return obj;
    }

    @Override
    public Object[] toArray() {
        if (this.isEmpty()) {
            return null;
        }
        Object[] array = new Object[this.size()];
        for (int i = 0; i < this.size(); i++) {
            array[i] = this.get(i);
        }
        return array;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
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
    public boolean equals(Object var1) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean removeIf(Predicate<? super E> predicate) {
        return false;
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

