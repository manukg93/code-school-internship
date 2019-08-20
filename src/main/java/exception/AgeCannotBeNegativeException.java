package exception;

public class AgeCannotBeNegativeException extends RuntimeException{

    public AgeCannotBeNegativeException(String message) {
        super(message);
    }
}
