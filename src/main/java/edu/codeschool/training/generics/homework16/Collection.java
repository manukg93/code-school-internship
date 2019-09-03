package edu.codeschool.training.generics.homework16;

public class Collection<T> {

    private T[] collection;
    private int index;
    private int countElements;

    private static final int DEFAULT_LENGTH = 100;

    // constructor
    public Collection(int length){

        if (length < 0) {

            System.out.println("collection size < 0");
            this.collection = (T[]) new Object[DEFAULT_LENGTH];

        } else {
            this.collection = (T[]) new Object[length];
        }
        this.index = 0;
        this.countElements = 0;

    }

    // get capacity
    public int length() {
        return this.collection.length;
    }

    // public void add(T element) adds the element to collection if there is enough place.
    // throws ColloectionIsFullException if there is no place to add.
    public void add(T element) throws CollectionIsFullException {

        if (this.index >= this.collection.length) {

            throw new CollectionIsFullException("collection is full");
        }
        this.collection[this.index++] = element;
        ++this.countElements;
    }

    // public int size() returns the number of elements currently existing in collection
    public int size() {
        return this.countElements;
    }

    // public T get(int index) returns the value of collection of the given index.
    // throws IndexOutOfBoundsException if index is out of bounds.
    public T getElementAtIndex(int index) {

        if (index < 0 || index >= this.collection.length) {
            throw new IndexOutOfBoundsException("out of bounds");
        }
        return this.collection[index];
    }

    // public boolean isEmpty() returns true if collection is empty false otherwise.
    public boolean isEmpty() {

        if (this.size() == 0) {
            return true;
        }
        return false;
    }

    // public boolean contains(T elem) checks if the container contains the elem or not.
    public boolean contains(T elem) {

        for (T el : this.collection ) {

            if (elem.equals(el)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder collectionStr = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            collectionStr.append(this.collection[i]).append(',');
        }
        return collectionStr.toString();
    }









}
