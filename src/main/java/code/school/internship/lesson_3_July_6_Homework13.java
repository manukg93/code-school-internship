package code.school.internship;

public class lesson_3_July_6_Homework13 {
    public static void main(String[] args) {
        char[]array = {'a','A','N','?','.','P','v','T','f','0','i','1','L','k','m','H'};
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=97 && array[i]<=122)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
