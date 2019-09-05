package edu.codeschool.training.classes_objects.homework_17_Collection;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ArrayList<T> implements List<T>,Iterable<T> {
    int index=0;
    T[] arrayList=(T[]) new Object[10];

    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        if(size()==0){
            return true;
        } else
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (T el:arrayList) {
            if(el.equals(o)){
                return true;
            }
        }return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int current;
            private T[] iterator;

            @Override
            public boolean hasNext() {
                return (current < iterator.length);
            }

            @Override
            public T next() {
                return iterator[current++];
            }
        };
        }

    @Override
    public T[] toArray() {
        //Object[] obj = color_list.toArray()
        T [] array=(T[])new Object[size()];
        for (int i=0; i<size();i++){
            array[i]=arrayList[i];

        } return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        if(a.length>=size()){
            for (int i=0;i<size();i++){
                a[i]=(T1)arrayList[i];
            }
            return a;
        }else {
            T1[] newA = (T1[]) new Object[size()];
            for (int i = 0; i < size(); i++) {
                newA[i] = (T1) arrayList[i];
            }
            return newA;
        }
    }

    @Override
    public boolean add(T t) {
        arrayList[index] = t;
        index++;
        if (index >= arrayList.length) {
            T[] newArrayList = (T[]) new Object[index];
            for (int i = 0; i < arrayList.length; i++) {
                newArrayList[i] = arrayList[i];
            }

            this.arrayList = newArrayList;
        }
        arrayList[index] = t;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for(int i=0;i<arrayList.length;i++){
            if(arrayList[i].equals(o)){
                T[] removedArrayList=(T[])new Object[arrayList.length-1];
                for(int j=0;j<i;j++){
                    removedArrayList[j]=arrayList[i];
                }
                for(int j=i;j<arrayList.length-1;j++){
                    removedArrayList[j]=arrayList[i+1];
                }
                this.arrayList = removedArrayList;
                return true;
            }
        }return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object el : c)
            if (!contains(el))
                return false;
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        T[] addedArray=(T[])new Object[c.size()+size()];
        toArray(addedArray);
        for(int i=size();i<(c.size()+size());i++){
            for (Object el : c){
                addedArray[i]=(T)el;
            }
        }
        this.arrayList=addedArray;
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public void replaceAll(UnaryOperator<T> operator) {

    }

    @Override
    public void sort(Comparator<? super T> c) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

}
