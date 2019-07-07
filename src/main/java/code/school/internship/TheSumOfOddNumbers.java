package code.school.internship;

public class TheSumOfOddNumbers {
    public static void main(String[] args) {
        int sum=0;
        for (int n = 1; n < 1000000; n +=2){
            sum+=n;
        }
            System.out.println(sum);

    }
}