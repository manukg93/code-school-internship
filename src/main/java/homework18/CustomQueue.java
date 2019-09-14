package homework18;


import homework17.arraylist.ArrayList;

import java.util.NoSuchElementException;

public class CustomQueue<E> {
    private ArrayList<E> list = new ArrayList<>();
    int size;

    public CustomQueue(int size){
        this.size=size;
    }


    public boolean add(E e){
        if(e == null){
            throw new NullPointerException();
        }

        return list.add(e);
    }

    public boolean offer(E e){
        if(e == null){
            throw new NullPointerException();
        }
       if(this.size>list.size()){

           return list.add(e);
       }

       return false;
    }

    public E remove(){
        if(list.size()==0){
            throw new NoSuchElementException("Empty");
        }
        return list.remove(0);
    }

    public E poll(){
        return list.remove(0);
    }
    public E element(){
        if(list.size()==0){
            throw new NoSuchElementException("Empty");
        }
        return list.get(0);
    }
    public E peek(){
        return list.get(0);
    }

}
