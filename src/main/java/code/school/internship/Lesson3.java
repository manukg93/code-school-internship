package main.java.code.school.internship;

public class Lesson3 {
    public static void main(String[] args) {
        int Number = 1000000;
        int sum = 0;
        for(int i = 1; i <= Number; i+=2){
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
