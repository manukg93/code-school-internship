package homework11.ex2;

public class IllegalEmailException extends RuntimeException {
    private String message;

    public IllegalEmailException(String message) {
        this.message = message;
    }
}
