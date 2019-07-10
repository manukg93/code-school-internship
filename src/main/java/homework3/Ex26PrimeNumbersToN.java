package homework3;

public class Ex26PrimeNumbersToN {
    public static void main(String[] args) {
        //Write a program to print all Prime numbers between 1 to n(n = 1000).
        int n = 1000, temp;
        System.out.print("The prime numbers is: ");
        for (int i = 2; i <= n; i++) {
            temp=0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = 1;
                    break;
                }
            }
            if(temp==0) {

                System.out.print(i+" ");
            }
        }
    }
}

