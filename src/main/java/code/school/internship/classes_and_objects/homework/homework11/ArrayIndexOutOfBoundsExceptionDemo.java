package code.school.internship.classes_and_objects.homework.homework11;


public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        try {
            int c = arr[4];
            System.out.println(c);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("there is an array error in your code");
        }
        finally {
            System. out. println( "finally") ;
        }
    }
}