package code.school.internship.Lesson2.ControlStatements;

public class Symbol {
    public static void main(String[] args) {
        char symbol = 'a';

        if ((symbol >= 65) && (symbol <= 90)) {
            symbol += 32;
            System.out.println(symbol);
        }

        if ((symbol >= 97) && (symbol <= 122)) {
            symbol -= 32;
            System.out.println(symbol);
        }

    }
}
