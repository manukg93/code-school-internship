package homework16.ex2;

import java.util.Arrays;

public class Collection<W> {
    private W[] coll;
    private int size;
    int index = 0;

    public Collection(int size) {
        if (size > 10 || size < 1) {
            System.out.println("Wrong size");
        } else {
            this.coll = (W[]) new Object[size];
        }
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size)  {
        if (size > 10 || size < 1) {
            System.out.println("Wrong size");
        } else {
            this.size = size;
        }
        this.size = size;
    }

    public void addEl(W el) throws CollectionIsFullException {
        if(index>=coll.length){
            throw new CollectionIsFullException("Collection is full");
        }else{
            for (int i = index; i < coll.length; i++) {
                if(coll[index]!=null){
                    throw new CollectionIsFullException("Collection is full");
                }else {
                    coll[i] = el;
                    index++;
                    break;
                }
            }
        }
    }

    public W getIndex(int index) throws IndexOutOfBoundsException{
        if(index < coll.length && index>=0){
            return coll[index];
        }
        else throw new IndexOutOfBoundsException();
    }

    public boolean isEmpty(){
        if(coll[0]==null){
            return true;
        }
        return false;
    }

    public boolean contains(W el){
        for (int i = 0; i < coll.length ; i++) {
            if(coll[i]==el){
                return true;
            }
        }
        return false;
    }

    public int size(){
        int count = 0;
        for (int i = 0; i < coll.length; i++) {
            if(coll[i]!=null){
                count++;
            }
        }
        return count;
    }
    @Override
    public String toString(){
        return Arrays.toString(coll);
    }
}
