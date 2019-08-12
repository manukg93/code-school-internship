package homework11.ex1;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        try {
            String a = "Hello";
            int b = Integer.parseInt(a);
        }catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
}
