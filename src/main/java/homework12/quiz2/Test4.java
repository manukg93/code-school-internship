package homework12.quiz2;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("method return ->" +m());
    }
    static String m(){
        try {
            int i=10/0;
        }catch (ArithmeticException e){
            return "Catch";
        }finally {
            return "Finally";
        }
        //method return -> finally
    }
}
