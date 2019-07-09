package code.school.internship;

public class Ex20MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,5,6};

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != i) {
                System.out.println("The missing number is " + i);
                break;
            }
        }
    }
}
