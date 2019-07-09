package code.school.internship;

public class Ex15 {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 30;

        while(firstNumber <= secondNumber) {
            if ((firstNumber % 3 == 0) && (firstNumber % 7 != 0)) {
                System.out.print(firstNumber + " ");
            }
            firstNumber++;
        }

        System.out.println();
    }
}
