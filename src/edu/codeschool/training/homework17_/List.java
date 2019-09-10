package edu.codeschool.training.homework17_;

public interface List<E> {
    public void add(E e);
    public E get(int i);
    public int size();
    public boolean contains(E e);
    public int indexOf(E e);
}
