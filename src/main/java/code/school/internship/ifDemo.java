package code.school.internship;

public class ifDemo {
    public static void main(String[] args) {

        // using nested if
        int number = 18;
        boolean bool = false;

        if (number % 3 == 0) {
            if (number % 7 == 0) {
                bool = true;
                System.out.println(bool);
                System.out.println("The number divides unto 3 and 7");
            } else {
                System.out.println(bool);
                System.out.println("The number divides unto 3 but not unto 7");
            }
        } else {
            System.out.println(bool);
            System.out.println("The number does not divide unto 3 and 7");
        }


        /*

        // using logical operator AND
        int num = 28;
        boolean check = false;

        if ((num % 3 == 0) && (num % 7 == 0)) {
            check = true;
            System.out.println(check);
            System.out.println("The number divides unto 3 and 7");
        } else {
            System.out.println(check);
            System.out.println("The number does not divide unto 3 and 7");
        }

         */

    }
}
