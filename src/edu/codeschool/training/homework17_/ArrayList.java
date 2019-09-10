package edu.codeschool.training.homework17_;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {

    private E [] arr = (E[]) new Object[10];
    public static int size = 0;
    @Override
    public void add(E e) {
        this.arr[this.size++] = e;
        if(check()){
            this.arr = getNewArr();
        }
    }

    @Override
    public E get(int i) {
        return  this.arr[i];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(E e) {
        for(int i = 0; i < this.arr.length; i++){
            if(this.arr[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E e) {
        for(int i = 0; i < this.arr.length; i++){
            if(this.arr[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    private boolean check(){
        if(this.size == this.arr.length){
            return true;
        }
        return false;
    }

    private E [] getNewArr(){
        E [] arrNew = (E[]) new Object[this.size * 2];
        for(int i = 0; i < this.arr.length; i++){
            arrNew[i] = this.arr[i];
        }
        return arrNew;
    }

    @Override
    public String toString() {
        String st = "";
        String st_ = ", ";

        for(int i = 0; i < this.arr.length; i++){
            if(this.arr[i]!=null){
                st_ = "";
                st += this.arr[i] + st_;

            }
        }
        return st;

    }
}
