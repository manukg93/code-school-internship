package homework17.arraylist;

import java.util.*;
//kisat
public class ArrayList<E> implements List<E> {
    private E[]array;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() { //??
        return null;
    }

    @Override
    public Object[] toArray() { //??
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) { //??
        return null;
    }

    @Override
    public boolean add(E e) {
        if(size==array.length){
            E[] newArray =(E[]) new Object[size*2];
            for (int i = 0; i < array.length; i++) {
                newArray[i]=array[i];
            }
            this.array=newArray;
        }
        if(size < array.length){
            array[size++]=e;
            return true;
        }
        return false;

    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < array.length ; i++) {
            if(array[i].equals(o)){
                array[i]=null;
                size--;
                for (int j = i+1; j <array.length ; j++) {
                    array[j-1]=array[j];
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) { //??
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) { //??
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) { //??
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (int i = 0; i < array.length; i++) {
            array[i]=null;
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {//??
        return false;
    }

    @Override
    public void clear() {
        //removeall?
    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public E set(int index, E element) {
        array[index]=element;
        return element;
    }

    @Override
    public void add(int index, E element) { //??

    }

    @Override
    public E remove(int index) { //??
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = array.length; i > 0 ; i--) {
            if(array[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {//??
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {//??
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) { //??
        return null;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
