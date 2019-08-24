package code.school.internship.homework1_2_3;

public class CommonElements16 {
    public static void main(String[] args) {
        int[]array1={1, 2, 3, 4};
        int[]array2={3, 4, 5, 6};
         for(int i=0; i<array1.length; i++){
             for(int k=0; k<array2.length; k++){
                 if(array1[i]==array2[k]){
                     System.out.println(array1[i]);
                 }
             }
         }

    }
}
