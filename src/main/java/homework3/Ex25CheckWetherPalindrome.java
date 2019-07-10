package homework3;

public class Ex25CheckWetherPalindrome {
    public static void main(String[] args) {
        //Write a program to check whether a number is palindrome or not.
        int x=12321;
        int reverse=0;
        int temp=x;
        while(x!=0) {

            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x=x/10;
        }
        if (temp==reverse){
            System.out.println("The number is Palindrome.");
        }else{
            System.out.println("The number is not Palindrome.");
        }
    }
}