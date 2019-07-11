package code.school.internship.arrays_and_loops;

// Ex.21
public class Ex21Average {
    public static void main(String[] args) {
        int[] integers = {-4, 0, 16, -2, 5, 20};

        int max = integers[0];
        int min = integers[0];
        int sumOfIntegers = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > max) {
                max = integers[i];
            }
            if (integers[i] < min) {
                min = integers[i];
            }
        }

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == max || integers[i] == min) {
                continue;
            }
            sumOfIntegers += integers[i];
        }

        //compute the average without max and min
        double average = (double)(sumOfIntegers) / (integers.length - 2);
        System.out.println("The average value without max and min is " + average);
    }
}
