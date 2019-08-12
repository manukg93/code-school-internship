package homework11.ex1;

public class NullPointerExceptionDemo {
    static String method(String a){
        return a.toUpperCase();
    }

    public static void main(String[] args) {
        try {
            String a = null;
            NullPointerExceptionDemo.method(a);
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}
