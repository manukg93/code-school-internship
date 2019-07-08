package Day_09_07_19;
public class HomeworkeOne {
    public static void main(String[] args) {
        // Write a program that prints the sum of odd numbers from 1 to N number(N = 1000_000).
          for (int x = 0; x < 1000000; x++) {
              if (x%2==1);
              System.out.println(x + " ");
          }
        int sum = 0;
              for (int i = 1; i <= 1000000; i++) {
              if (i % 2 != 0) {
                  sum = sum + 1;
              }
          }
              System.out.println("The number of the odd numbers is " + sum);
    }
}