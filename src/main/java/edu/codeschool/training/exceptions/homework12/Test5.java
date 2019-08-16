package edu.codeschool.training.exceptions.homework12;

public class Test5 {

    public static void main(String[] args) {

        try {
            String[] names = {"Jack", "John", "Jill"};
            printNames(names);
        } catch (NameIsJohnException e) {
            System.out.println("NameIsJohnException");
        }
    }

    private static void printNames(String[] names) throws NameIsJohnException {

        for (String name : names) {

            if (name.equals("John")) {
                throw new NameIsJohnException("Name cannot be John");
            }

            System.out.println(name + " ");
        }
    }
}

// class NameIsJohnException must be a subclass of Throwable
class NameIsJohnException extends Exception {

    String message;

    public NameIsJohnException() {}

    public NameIsJohnException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
