package ArraysContinuation_13_07_2019;

public class PalindromNumber_25 {
    public static void main(String[] args) {
        int r, sum=0, q;
        int n=12321;
        q=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        int a =12321;
        if(q==sum)
            System.out.println("The given number " + a + " is palindrome");
        else
            System.out.println("The given number " + a + " isn't palindrome");
    }
}
