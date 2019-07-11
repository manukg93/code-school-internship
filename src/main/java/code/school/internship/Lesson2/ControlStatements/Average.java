package code.school.internship.Lesson2.ControlStatements;

public class Average {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 7;
        int number3 = 56;
        int number4 = 23;
        int number5 = -12;

        int sum = number1 + number2 + number3 + number4 + number5;
        System.out.println("sum = " + sum);

        float average = (float)sum / 5;
        System.out.println("average = " + average);
    }
}
