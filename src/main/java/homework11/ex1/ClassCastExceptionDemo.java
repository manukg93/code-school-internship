package homework11.ex1;

public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        try {
            Object i = Integer.valueOf(42);
            String s = (String)i;

        }catch (ClassCastException ex){
            System.out.println(ex.getMessage());
        }
    }
}
