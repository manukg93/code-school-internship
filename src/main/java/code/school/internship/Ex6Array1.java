package code.school.internship;

// Calculate the average value of the elements
public class Ex6Array1 {
    public static void main(String[] args) {
        double[] array1 = {1.2, 2.2, 5.5, 4.5, 5, 7.8, 8.5, 7, 5.1, 3.15};
        final int SIZE = array1.length; // number of elements in the array
        double average = 0;
        double sum = 0;

        for (int i = 0; i < SIZE; i++) {
            sum += array1[i];
            average = sum / SIZE;
        }

        System.out.println("The average value of the array elements is " + average);
    }
}
