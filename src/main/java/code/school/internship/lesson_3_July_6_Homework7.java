package code.school.internship;

public class lesson_3_July_6_Homework7 {
    public static void main(String[] args) {
        int n = 19;
        int [] array ={1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32};
        for (int i = 0; i < array.length; i++)
        {
         if (array[i]== n)
         {
             System.out.println("array contains value ");
             break;
         }
         if (i == array.length -1)
         {
             System.out.println("array not contains value");
         }
        }
    }
}
