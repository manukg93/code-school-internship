package code.school.internship.homework1_2_3;

public class DuplicateValues12 {
    //array = {1, 2, 5, 5, 6, 6, 7, 2}.
    public static void main(String[] args) {
        int[]Array={1, 2, 5, 5, 6, 6, 7, 2};
        for(int i=0; i<Array.length; i++)
            for(int d=i+1; d<Array.length; d++){
                if(Array[i]==Array[d]){
                    System.out.println("Duplicat value is "+Array[d]);
                }

        }
    }
}
