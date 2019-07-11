package code.school.internship.Lesson2.ControlStatements;

public class isOdd {
    public static void main(String[] args) {
        int number = 23;

        if (number % 2 != 0) {
            System.out.println(number + " is odd number");
        } else {
            System.out.println(number + " is even number");
        }
    }
}
