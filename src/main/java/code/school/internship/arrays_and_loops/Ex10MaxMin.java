package code.school.internship.arrays_and_loops;

// Find maximum and minimum values of the array
public class Ex10MaxMin {
    public static void main(String[] args) {
        int[] values = {12, 45, -8, 9, 11, 6};
        int max = values[0];
        int min = values[0];

        for(int i = 1; i < values.length; i++) {
            if(values[i] > max) {
                max = values[i];
            }
            if(values[i] < min) {
                min = values[i];
            }
        }

        System.out.println("Maximum value is " + max);
        System.out.println("Minimum value is " + min);
    }
}
