package code.school.internship.classes_and_objects.homework.homewok3;

public class lesson_3_July_6_Homework16 {
    public static void main(String[] args) {
        int[]array={1,2,5,7,9,10};
        int[]array1={2,7,9,40,77,68};
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i]==array1[j])
                {
                    System.out.println(array[i]);
                }
            }
        }
    }
}