package edu.codeschool.training.collections.homework17.array_list;

import java.util.*;
import java.util.function.Predicate;

public class ArrayList<E> implements List<E> {

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
            for (int i = 0; i < this.size(); i++ ) {
                this.array[i] = null;
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
    public boolean containsAll(Collection<?> var1) {
        if (var1.size() > this.size()) {
            return false;
        }
        for ( Object el : var1 ) {
            if (!this.contains(el)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int indexOf(Object obj) {
        for (int i = 0; i < this.countOfElements; i++) {
            if (obj.equals(this.array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        for (int i = this.countOfElements - 1; i >= 0; i--) {
            if (obj.equals(this.array[i])) {
                return i;
            }
        }
        return -1;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.countOfElements) {
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
            }
            this.array = copyArray;
        }
        this.array[countOfElements++] = e;
        return true;
    }

    @Override
    public void add(int index, E obj) {
        checkIndex(index);
        if (this.array == null) {
            System.out.println("No array list.");
            return;
        }
        if (this.countOfElements >= this.array.length) {
            E[] copyArray =(E[]) new Object[this.array.length * 2];
            for(int i = 0; i < this.array.length; i++) {
                copyArray[i] = this.array[i];
            }
            this.array = copyArray;
        }
        for (int i = this.countOfElements; i > index; i--) {
            this.array[i] = this.array[i - 1];
        }
        this.array[index] = obj;
        this.countOfElements++;
    }

    @Override
    public boolean addAll(Collection<? extends E> var1) {
        for (E el : var1 ) {
            this.add(el);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> col) {
        checkIndex(index);
        int i = index;
        for ( E el : col ) {
            add(i, el);
            i++;
        }
        return true;
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
            for (int i = index+1; i < this.size(); i++) {
                this.array[i-1] = this.array[i];
            }
            this.array[--countOfElements] = null;
            return true;
        }
        return false;
    }

    @Override
    public E remove(int index) {
        this.checkIndex(index);
        E obj = this.array[index];
        for (int i = index+1; i < this.size(); i++) {
            this.array[i-1] = this.array[i];
        }
        this.array[--this.countOfElements] = null;
        return obj;
    }

    @Override
    public boolean removeAll(Collection<?> var1) {
        ArrayList<E> list = (ArrayList<E>) var1;
        if (list.countOfElements > this.countOfElements) {
            return false;
        }
        if (!this.containsAll(list)) {
            return false;
        }
        for ( Object el : list ) {
            this.remove(el);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> var1) {
//        if (var1 == null) {
//            throw new NullPointerException();
//        }
//        for ( Object obj : var1 ) {
//            if (obj == null) {
//                throw new NullPointerException();
//            }
//        }
//        int len = this.countOfElements;
//        for ( E obj : this.array) {
//            if (!var1.contains(obj)) {
//                this.remove(obj);
//            }
//        }
//        if (this.countOfElements < len) {
//            return true;
//        }
        return false;
   }

    @Override
    public Object[] toArray() {
        if (this.isEmpty()) {
            return null;
        }
        Object[] array = new Object[this.size()];
        for (int i = 0; i < this.size(); i++) {
            array[i] = this.array[i];
        }
        return array;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        ArrayList<E> other = (ArrayList<E>)object;
        if (other.countOfElements != this.countOfElements) {
            return false;
        }
        for (int i = 0; i < this.countOfElements; i++) {
            if (!(other.array[i].equals(this.array[i]))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < this.size(); i++) {
            if (i == this.size() - 1) {
                str.append(this.array[i].toString());
            } else {
                str.append(this.array[i].toString()).append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }

    @Override
    public ArrayListIterator<E> iterator() {
        return new ArrayListIterator<E>(this);
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
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
        return new CustomListIterator<>(this.array, this.countOfElements);
    }

    @Override
    public ListIterator<E> listIterator(int var1) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex >= this.countOfElements) {
            throw new IndexOutOfBoundsException();
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException();
        }
        return null;
    }
}
