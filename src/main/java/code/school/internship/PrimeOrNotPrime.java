package code.school.internship;

public class PrimeOrNotPrime {
    public static void main(String[] args) {
        int n = 1895627;
        if(n%2==0||n%3==0||n%4==0||n%5==0||n%6==0||n%7==0||n%8==0||n%9==0){
            System.out.println("The number is not prime.");
        } else{
            System.out.println("The number is prime.");
        }

    }
}
