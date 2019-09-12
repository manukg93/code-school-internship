package homework18;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class QueueDemo <T> {
    ArrayList<T> queue = new ArrayList<>();

    public boolean add(T t) {
        queue.add(t);
        return true;
    }

    public  boolean offer(T t){
        queue.add(0,t);
        return true;
    }

    public  T remove(){


        if(queue.size()==0){
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }

    public  T poll(){
        if(queue.size()==0){
            return  null;
        }
        return queue.remove(0);
    }

    public T element(){
        if(queue.size()==0){
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    public T peek(){
        if(queue.size()==0){
            return  null;
        }
        return  queue.get(0);
    }




    @Override
    public String toString() {
        return queue.toString();
    }
}