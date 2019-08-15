package code.school.internship.classes_and_objects.homework.homework11;

public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        Object i = Integer.valueOf(42);

        try {
            String s = (String)i;
            System.out.println(s);
        }
        catch(ClassCastException e) {
            System.out.println("there is an error in your code");
        }
        finally {
            System. out. println( "finally") ;
        }
    }
}
