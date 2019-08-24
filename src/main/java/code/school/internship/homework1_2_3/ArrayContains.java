package code.school.internship.homework1_2_3;

public class ArrayContains {
    //array = {1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32} and n = 19.
    public static void main(String[] args) {
         int Array [] ={1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32} ;
         int n =19;

         int arraylength=Array.length;
         if (arraylength>=n){
             System.out.println(Array[n-1]);
         }else{
             System.out.println("This Arraylength < n");
         }




    }
}
