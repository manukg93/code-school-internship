package edu.codeschool.training.classes_objects.homework_17_Collection;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ArrayList<T> implements List<T>,Iterable<T> {
    int index=0;
    T[] arrayList=(T[]) new Object[5];

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
            private int current=0;
            private T[] iterator = arrayList;


            @Override
            public boolean hasNext() {
                return (current < size());
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

        return a;
    }

    @Override
    public boolean add(T t) {
        if(index<arrayList.length){
            arrayList[index]=t;
            index++;
            return true;
        }else{
            T [] addedArrayList=(T[]) new Object[size()+1];
            for(int i=0;i<size();i++){
                addedArrayList[i]=arrayList[i];
            }
            addedArrayList[arrayList.length]=t;
            this.arrayList=addedArrayList;
            index++;
            return true;
        }
    }

    @Override
    public boolean remove(Object o) {
        for(int i=0;i<arrayList.length;i++){
            if(arrayList[i].equals(o)){
                for(int j=i;j<arrayList.length-1;j++){
                    arrayList[j] = arrayList[j + 1];
                }
                T [] removedArrayList=(T[])new Object[size()-1];
                for(int k=0;k<removedArrayList.length;k++){
                    removedArrayList[k]=arrayList[k];
                }
                this.arrayList=removedArrayList;
                index--;
            }
        }


        return true;

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
        T[] addedArray = (T[]) new Object[c.size() + size()];
        for (int i = 0; i < size(); i++) {
            addedArray[i] = arrayList[i];
        }
        Iterator<? extends T> iterator = c.iterator();
        while(iterator.hasNext())
            for (int i = size(); i < addedArray.length; i++){
                addedArray[i]=iterator.next();

        }
        this.arrayList = addedArray;
        this.index = c.size() + size();
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        T[] addedArray = (T[]) new Object[c.size() + size()];
        Iterator<? extends T> iterator = c.iterator();
        for (int i = 0; i < index; i++) {
            addedArray[i] = arrayList[i];
        }
        while(iterator.hasNext())
            for (int i = index; i < size(); i++){
                addedArray[i]=iterator.next();

            }
        for(int i=(c.size()+index);i<addedArray.length;i++){
            addedArray[i]=arrayList[index++];
        }
        this.arrayList=addedArray;
        this.index=c.size() + size();
        return true;
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        Iterator<?> iterator = c.iterator();
        for(T el:arrayList){
            while(iterator.hasNext()){
                el=(T)iterator.next();
                remove(el);
            }return true;
        }
      return false ;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        //??????????????
        return false;
    }

    @Override
    public void clear() {
        for (T el :arrayList) {
            remove(0);
        }
        index--;

    }

    @Override
    public T get(int index) {
        int num=-1;
        if(index<0 || index>arrayList.length){
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds: "    + index);
        }
        else
            return arrayList[index];
    }

    @Override
    public T set(int index, T element) {
        T oldElement = get(index);
        arrayList[index] = element;
        return oldElement;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        add(element);

        for (int i=size()-1; i>index; i--) {
            arrayList[i] = arrayList[i-1];
        }
        arrayList[index] = element;
    }

    @Override
    public T remove(int index) {
        T element = get(index);
        for (int i=index; i<size()-1; i++) {
            arrayList[i] = arrayList[i+1];

        }
        remove(arrayList[arrayList.length-1]);
        index--;
        return element;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i<size(); i++) {
            if (o.equals(arrayList[i])) {
                return i;
            }
        }return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for(int i=size()-1;i>=0;i--){
            if(arrayList[i].equals(o))
                return i;
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        //??????
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        //??????????
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        if(fromIndex < 0 || toIndex > size()){
            throw new IndexOutOfBoundsException("index out of bounds");
        }else if (fromIndex > toIndex){
            throw new IllegalArgumentException("fromIndex must be lower than toIndex");
        }else{
            T [] array= Arrays.copyOfRange(arrayList, fromIndex,toIndex);
            List<T> subList=Arrays.asList(array);
            return subList;
        }

    }

}
