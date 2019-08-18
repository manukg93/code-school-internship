package edu.codeschool.training.classes_objects.homework4.homework11;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 3, 9, 6, 8, 5};

                System.out.println(arr[11]);


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("illegal index to access an array");
        }finally {
            System.out.println("ok");
        }
    }

}