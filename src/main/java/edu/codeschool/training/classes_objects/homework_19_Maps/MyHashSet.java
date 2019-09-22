package edu.codeschool.training.classes_objects.homework_19_Maps;

import java.util.Collection;
import java.util.Iterator;

public class MyHashSet<E> implements java.util.Set<E> {

    private MyHashMap<E, Object> map;
    private static final Object PRESENT = new Object();

    public MyHashSet() {
        map = new MyHashMap<>();
    }


    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E el : c) {
            if (el == null) {
                throw new NullPointerException();
            } else {
                this.add(el);
            }
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object el : c) {
            if (map.containsKey(el)) {
                map.remove(el);
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        int oldSize=map.size();
        this.removeAll(c);
        if(oldSize==this.map.size()){
            return false;
        }else
            return true;
    }

    @Override
    public boolean contains(Object o) {
        if (map.containsKey(o)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object el : c) {
            if (!this.contains(el)) {
                return false;
            }
        }
        return true;
    }


    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return map.keySet().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
