package code.school.internship.classes_and_objects.homework.homewok3;

public class lesson_3_July_6_Homework9 {
    public static void main(String[] args) {
        int [] array1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int [] array2 = new int[array1.length];
        for (int i = 0; i <array1.length ; i++)
        {
         array2[i]=array1[i];
            System.out.println(array1[i]);
            System.out.println(array2[i]);
        }
    }
}
