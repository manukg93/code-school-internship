package homework11.ex1;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int []array = new int[3];
        try {
            for (int i = 0; i < 5 ; i++) {
                array[i]=i;
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }
}
