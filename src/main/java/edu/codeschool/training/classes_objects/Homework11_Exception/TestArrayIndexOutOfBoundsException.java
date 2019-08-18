package edu.codeschool.training.classes_objects.Homework11_Exception;

public class TestArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8};
        try {
            System.out.println(array[9]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("array index must be lower than "+array.length);
        }
    }
}
