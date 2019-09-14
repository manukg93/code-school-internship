package homework18;

import homework17.arraylist.ArrayList;

import java.util.EmptyStackException;
import java.util.Vector;

public class CustomStack<E> extends Vector<E> {
    private ArrayList<E> arrayList = new ArrayList<>();
    int length = arrayList.size();

    public CustomStack(){

    }

    public E push(E item){
        arrayList.add(item);
        return item;
    }

    public E pop(){
        if(length==0){
            throw new EmptyStackException();
        }

        return  arrayList.remove(length-1);
    }

    public E peek(){
        if (length==0){
            throw new EmptyStackException();
        }
        return arrayList.get(length-1);
    }

    public boolean empty(){
        return length==0;
    }
    public int search(Object o){
        int a = arrayList.lastIndexOf(o);
        if(a>=0){
            return length-a;
        }
        return -1;
    }
}
