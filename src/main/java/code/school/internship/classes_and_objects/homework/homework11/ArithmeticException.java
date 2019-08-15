package code.school.internship.classes_and_objects.homework.homework11;



public class ArithmeticException extends Throwable {
    // Exercise 1
    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[101]);
        } catch (Exception e) {
            System.out.println("Incoherence in the array's index. Verify the index.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
