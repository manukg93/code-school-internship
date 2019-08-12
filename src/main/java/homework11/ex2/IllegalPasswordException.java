package homework11.ex2;

public class IllegalPasswordException extends RuntimeException {
    private String message;

    public IllegalPasswordException(String message) {
        this.message = message;
    }
}
