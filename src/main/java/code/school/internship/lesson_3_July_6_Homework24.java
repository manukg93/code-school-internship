package code.school.internship;

public class lesson_3_July_6_Homework24 {
    public static void main(String[] args) {
        double number = 1234567;
        int count = 0;
        do {
            number/=10;
            count++;
        }while (number/10>0.1);
        System.out.println(count);
    }
}
