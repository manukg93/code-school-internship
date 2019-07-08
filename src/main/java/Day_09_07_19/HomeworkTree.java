package Day_09_07_19;

public class HomeworkTree {
    public static void main(String[] args) {
        int y, prime;
        int x = 1895627;
        for (y = 2; y <= x; y++) {
            if (x % y != 0) {
                System.out.println("The given number " + (x) + " is a prime number");
                break;
            }
            if (x % y ==0) {
                System.out.println("The given number " + (x) + " isn't a prime number");
                break;
            }
        }
    }
}
