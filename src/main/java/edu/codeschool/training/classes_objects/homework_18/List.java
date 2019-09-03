package edu.codeschool.training.classes_objects.homework_18;

public interface List<E> {
    void add(E e);

    E get(int index);

    int size();

    boolean contains(E e);

    int indexOf(E e);
}
