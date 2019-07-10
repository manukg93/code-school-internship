package homework3;

public class Ex24NumberDigits {
    public static void main(String[] args) {
        // Write a program that prints the count of number of digits in a number.
        // ex. 1546987 -> The number of digits is 7
        int x=1546987;
        int countDigit=0;
        while(x>=1){
            x=x/10;
            countDigit++;

        }
        System.out.println(countDigit);
    }
}
