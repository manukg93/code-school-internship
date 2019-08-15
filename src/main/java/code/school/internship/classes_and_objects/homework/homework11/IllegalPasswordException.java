package code.school.internship.classes_and_objects.homework.homework11;



public class IllegalPasswordException extends RuntimeException {
    String message;

    public IllegalPasswordException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "IllegalPasswordException: " + message;
    }
}