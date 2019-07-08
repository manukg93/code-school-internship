package code.school.internship;

public class ArrayReverse {
    /*Given the array = {1,2,3,4,5,6}.Write a Java program to reverse the array of int values
    ex. {1,2,3,4,5,6} -> {6,5,4,3,2,1}  */
    public static void main(String[] args) {
        int Array[]={1,2,3,4,5,6};
        for(int i=0; i<Array.length;i++){
            int Reverse=Array[i];
            Reverse=Array[Array.length-(i+1)];
            System.out.println(Reverse);
        }
    }
}
