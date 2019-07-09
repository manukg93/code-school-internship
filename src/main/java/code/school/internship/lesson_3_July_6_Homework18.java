package code.school.internship;

public class lesson_3_July_6_Homework18 {
    public static void main(String[] args) {
        boolean[]bool={true,true,false,false,false,true};
        int count=0;
        int count1=0;
        for (int i = 0; i <bool.length ; i++) {
            if(bool[i]==true)
            {
                count++;
            }
            if(bool[i]==false)
            {
                count1++;
            }
        }
        System.out.println("True "+count);
        System.out.println("False"+count1);
    }
}