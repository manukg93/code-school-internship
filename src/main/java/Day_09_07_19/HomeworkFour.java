package Day_09_07_19;

public class HomeworkFour {
    public static void main(String[] args) {
        long number = 2, power = 9;
        long result = 1;
        while (power != 0)
        {
            result *= number;
            --power;
        }
        System.out.println("the answer is = " + result);
        }
    }