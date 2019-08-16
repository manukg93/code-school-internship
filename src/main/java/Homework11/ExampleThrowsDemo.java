package Homework11;

public class ExampleThrowsDemo {
    static void throwOne() throws IllegalAccessError {
        System.out.println("in the method of throwOne(). ");
        throw new IllegalAccessError("Demmo");
    }
    public static void main(String args[]){
        try {
            throwOne();
        } catch (IllegalAccessError e) {
            System.out.println("Cahced an exception " + e);
        }
    }
}
