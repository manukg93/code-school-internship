package Day_09_07_19;

public class HomeworkFive {
    public static void main(String[] args) {
        //  Write a program to calculate the sum of following series where n = 10000.
        //  1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n
        double x, result = 0;
        for (x = 1; x <= 10000; x++) {
            result = result + 1 / x;
        }
            System.out.println("The result is equal to: " + result);
    }
}
