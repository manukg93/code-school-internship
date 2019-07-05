package code.school.internship;

public class ifDemo2 {
    public static void main(String[] args) {
        int number = 10;
        boolean check = false;

        // using logical operator OR
        if ((number % 5 == 0) || (number % 6 == 0)) {
            check = true;
            System.out.println(check);
            System.out.println("Number " + number + " divides unto 5 or 6");
        }

        int num = 13;
        boolean ch = false;

        // using if-else-if
        if (num % 5 == 0) {
            ch = true;
            System.out.println(ch);
            System.out.println("Number "  + num + " divides unto 5 or 6");
        } else if (num % 6 == 0) {
            ch = true;
            System.out.println(ch);
            System.out.println("Number " + num + " divides unto 5 or 6");
        } else {
            System.out.println(ch);
            System.out.println("Number " + num + " does not divide unto 5 or 6");

        }

        int nm = 24;
        boolean bool = false;

        // using nested if
        if (nm % 5 == 0) {
            bool = true;
            System.out.println(bool);
            System.out.println("Number " + nm + " divides unto 5 or 6");
        }
        if (nm % 6 == 0) {
            bool = true;
            System.out.println(bool);
            System.out.println("Number " + nm + " divides unto 5 or 6");
        }

    }
}
