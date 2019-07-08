package code.school.internship;

public class ArrayDublicateValues {
    public static void main(String[] args) {
       // Given array = {1, 2, 5, 5, 6, 6, 7, 2}.
        //        Write program that prints duplicate values of the array.
        int [] Array={1, 2, 5, 5, 6, 6, 7, 2};
        for (int i=0;i<Array.length;i++) {
            for (int k=i+1;k<Array.length;k++)
                if (Array[k] == Array[i])
                    System.out.println("Duplicate value is: "+Array[i]);
        }
    }
}
