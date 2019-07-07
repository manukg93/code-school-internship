package code.school.internship;

public class OddNumbersSum {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <1000000; i+=2){
            sum+=i; // sum=sum+i
        }
        System.out.println("Sum of odd numbers is "+sum);

    }
}

