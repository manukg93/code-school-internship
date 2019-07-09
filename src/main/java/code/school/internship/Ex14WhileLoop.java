package code.school.internship;

public class Ex14WhileLoop {
    public static void main(String[] args) {
        int firstNumber = 13;
        int secondNumber = 25;
        int sumOfOdds = 0;

        while(firstNumber <= secondNumber) {
            if (firstNumber % 2 == 0) {
                System.out.print(firstNumber + " ");
            } else {
                sumOfOdds += firstNumber;
            }
            firstNumber++;
        }
        System.out.println();
        System.out.println("Sum of odd numbers is " + sumOfOdds);
    }
}
