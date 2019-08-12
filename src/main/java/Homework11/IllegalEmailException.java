package Homework11;

public class IllegalEmailException extends RuntimeException {
    public IllegalEmailException(String email) {
        super(email);
        System.out.println("Incorrect format");
    }
}
