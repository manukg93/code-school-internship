package edu.codeschool.training.collections.homework17;


public class ArrayListIterator<E> implements java.util.Iterator<E> {

    private ArrayList<E> arrayList;
    private int count = 0;

    //constructor
    public ArrayListIterator(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return this.count < this.arrayList.size();
    }

    @Override
    public E next() {
        return this.arrayList.get(this.count++);
    }
}
