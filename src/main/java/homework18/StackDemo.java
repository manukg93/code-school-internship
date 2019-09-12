package homework18;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackDemo<E> {

    ArrayList<E> stack = new ArrayList<>();

    public E push(E e) {
        stack.add(e);
        return e;
    }

    public E pop() {

        if (stack.size() == 0) {
            throw new EmptyStackException();
        }
        return  stack.remove(stack.size()-1);
    }

    public E peek(){
        if(stack.size()==0){
            throw new EmptyStackException();
        }
        return stack.get(stack.size()-1);
    }

    public  boolean empty(){
        return stack.isEmpty();
    }

    public int search(E e) {
        if (stack.lastIndexOf(e) >= 0) {
            return stack.lastIndexOf(e);
        }
        return -1;
    }
    @Override
    public String toString() {
        return stack.toString();
    }
}