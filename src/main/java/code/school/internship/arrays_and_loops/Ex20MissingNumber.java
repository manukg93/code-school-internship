package code.school.internship.arrays_and_loops;

// Ex.20
public class Ex20MissingNumber {
    public static void main(String[] args) {

        int[] intNumbers = {1, 2, 3, 4, 5, 6, 7, 9};

        for(int i = 0; i < intNumbers.length - 1; i++) {
            if (intNumbers[i+1] - intNumbers[i] != 1) {
                System.out.println("The missing number is " + (i+1+1));
                return;
            }
        }
        System.out.println("There is no missing number");
    }
}
