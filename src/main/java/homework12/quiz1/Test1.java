package homework12.quiz1;

public class Test1 extends Exception {
    public static void main(String[] args) {
        try {
            System.out.println("My Custom Exception test");
            throw new Test1();
        }catch (Exception e){
            System.out.println("Test1 Exception");
        }
    }
}
