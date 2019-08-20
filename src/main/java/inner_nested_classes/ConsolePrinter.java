package inner_nested_classes;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Console Printer" + message);
    }

    @Override
    public void print1(String message) {

    }
}
