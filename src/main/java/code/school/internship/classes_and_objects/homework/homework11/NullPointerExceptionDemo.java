package code.school.internship.classes_and_objects.homework.homework11;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.toUpperCase());
        }
        catch(NullPointerException e) {
            System.out.println("there is an error in your code \n" + e.getMessage());
        }
        finally {
            System. out. println( "finally") ;
        }
    }
}
