package edu.codeschool.training.homework17.exercise1;

import java.util.*;

public class ArrayList<E> implements List<E> {

    private E[] arr = (E[]) new Object[10];
    private int count = 0;

    private void checkCount(){
        if(this.count == this.arr.length)
            createNewArr();
    }

    private void createNewArr(){
        E[] arrNew = (E[]) new Object[(int)((double)this.arr.length * 1.5)];
        for (int i = 0; i < this.arr.length; i++){
            arrNew[i] = this.arr[i];
        }
        this.arr = arrNew;
    }
    private void throwException(int i){
        if(i >= this.count)
            throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if(count == 0)
            return true;
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < this.arr.length; i++){
            if(o.equals(this.arr[i]))
                return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator(this.arr, this.count);
    }

    @Override
    public Object[] toArray() {
        E[] arrTmp = (E[]) new Object[count];
        for (int i = 0; i < count; i++)
            arrTmp[i] = this.arr[i];
        return (Object[]) arrTmp;
    }

    @Override
    public boolean add(Object o) {
        this.arr[count++] = (E) o;
        checkCount();
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int k = 0;
        for (int i = count-1; i > 0; i--) {
            E[] arrTmp = (E[]) new Object[count - i];
            arrTmp[k++] = this.arr[i];
            if(o.equals(this.arr[i])){
                this.arr[i] = null;
                count--;
                for(int j = (arrTmp.length-1); j > 0; j--)
                    add(arrTmp[j]);
                return true;
            }
        }
            return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<E> iterator = (Iterator<E>) collection.iterator();
        while(iterator.hasNext())
            this.add(iterator.next());

        return true;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
            throwException(i);
            int k = 0;
            E[] arrTmp = (E[]) new Object[count - i];
            for (int j = i; j < this.arr.length; j++)
                arrTmp[k++] = this.arr[j];

            for (int j = count-1; j > i; j--)
                remove(this.arr[j]);

        Iterator<E> iterator = (Iterator<E>) collection.iterator();
            while (iterator.hasNext())
                this.add(iterator.next());

            for (int j = 0; j > arrTmp.length; j++)
                add(arrTmp[j]);

        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.arr.length; i++){
            this.arr[i] = null;
        }
        this.count = 0;
    }

    @Override
    public E get(int i) {
        throwException(i);
        return this.arr[i];
    }

    @Override
    public Object set(int i, Object o) {
        throwException(i);
        E tmpOb = this.arr[i];
        this.arr[i] = (E) o;
        return tmpOb;
    }

    @Override
    public void add(int i, E o) {
        throwException(i);
        count++;
        for (int j = this.count; j > i; j--)
            this.arr[j] = this.arr[j-1];

        this.arr[i] = o;
    }

    @Override
    public E remove(int i) {
        throwException(i);
        E tmpOb = this.arr[i];
        remove(this.arr[i]);
        return tmpOb;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < this.arr.length; i++){
            if(o.equals(this.arr[i]))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i =  this.arr.length; i >= 0; i--){
            if(o.equals(this.arr[i]))
                return i;
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new CustimListIterator<E>(this.arr, this.count);
    }

    @Override
    public ListIterator<E> listIterator(int i) {
        return null;
    }

    @Override
    public List subList(int i, int i1) {
        return null;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        Iterator<E> iterator = (Iterator<E>) collection.iterator();
        while (iterator.hasNext()){
            if(contains(iterator.next())){
                remove(iterator.next());
            }
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection collection) {
        Iterator<E> iterator = (Iterator<E>) collection.iterator();
        while (iterator.hasNext())
            if(!contains(iterator.next())) return false;

        return true;
    }

    @Override
    public E[] toArray(Object[] objects) {
        E[] arrTmp = (E[]) new Object[objects.length];
        if(objects.length<count){
            for (int i = 0; i > objects.length; i++)
                arrTmp[i] = this.arr[i];
        }else{
            for (int i = 0; i > objects.length; i++){
                if(i<count)
                    arrTmp[i] = this.arr[i];
                else
                    arrTmp[i] = null;
            }
        }


        return arrTmp;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}

class Iterator<E> implements java.util.Iterator<E> {
    private E[] array;
    private int countIter = 0;
    private int count;
    public Iterator (E[] arr,int count){
        this.array = arr;
        this.count = count;
    }

    public boolean hasNext(){
        return countIter < count;
    }

    public E next(){
        return this.array[countIter++];
    }

    public void remove(){
        this.array[countIter++] = null;
    }

}

class CustimListIterator<E> implements java.util.ListIterator<E> {

    private E[] array;
    private int size;
    private int current = 0;
    private boolean remove = false;

    public CustimListIterator(E[] array, int size){
        this.array = array;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return current < size;
    }

    @Override
    public E next() {
        if(!this.remove){
            this.remove = false;
            if(current < size)
                return this.array[current++];
            else
                throw new NoSuchElementException();
        }
        if(current < size)
            return this.array[current];
        else
            throw new NoSuchElementException();


    }

    @Override
    public boolean hasPrevious() {
        return current > 0;
    }

    @Override
    public E previous() {
        if(!this.remove){
            this.remove = false;
        }
        if(current > 0)
            return this.array[current--];
        else
            throw new NoSuchElementException();
    }

    @Override
    public int nextIndex() {
//        if(current >= size-1){
//            return size;
//        }else{
//            return current+1;
//        }
        return current < size ? current + 1 : size;
    }

    @Override
    public int previousIndex() {
        return current == 0 ? -1 : current - 1;
    }

    @Override
    public void remove() {
        if(!this.remove){
            for(int i = current; i < size - 1; i++){
                this.array[i] = this.array[i+1];
            }
            this.array[--size] = null;
            this.remove = true;
        }

    }

    @Override
    public void set(E e) {
        this.array[current] = e;
    }

    @Override
    public void add(E e) {

    }
}