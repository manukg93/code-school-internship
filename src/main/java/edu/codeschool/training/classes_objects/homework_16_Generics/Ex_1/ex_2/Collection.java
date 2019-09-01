package edu.codeschool.training.classes_objects.homework_16_Generics.Ex_1.ex_2;


import java.util.Arrays;

public class Collection <T>{
    private int length;
    private T[] array;


    public Collection(int length) {
        if(length>20||length<1){
            System.out.println("Wrong array length");
        }else{
            this.array = (T[]) new Object[length];
        }
    }

    public int getLength() {
        return this.array.length;
    }

    public void setLength(int length) {
        if(length>20||length<1){
            System.out.println("Wrong array length");
        }else{
            this.length = length;
        }

    }
    int index=0;
    public void addElement(T element) throws CollectionIsFullException {

        if(index>=array.length){
            throw new CollectionIsFullException("There is no place to add element");
        }else{
            for(int i=index;i<array.length;i++){
                if(this.array[index]!=null){
                    throw new CollectionIsFullException("Collection is full");
                }else {
                    this.array[i]=element;
                    index++;
                    break;
                }
            }System.out.println(Arrays.toString(array));
        }
    }

    public T[] removeElement(T element){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                for(int j=i;j<array.length-1;j++){
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = null;
                }


            }
        } return array;
    }

    public T getIndex(int index) throws IndexOutOfBoundsException {
        if(index<array.length){
            return array[index];
        }else{
            throw new IndexOutOfBoundsException("Index must be lower than array length ! ! ! ");
        }
    }

    public boolean isEmpty(){
        if (array[0]==null) {
            return true;
        }else return false;
    }

    public boolean containsElement(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }return false;
    }

    public int size(){
        int elementCount=0;
        for(int i=0;i<array.length;i++){
            if (array[i]!=null){
                elementCount++;
            }
        }return elementCount;
    }
    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
