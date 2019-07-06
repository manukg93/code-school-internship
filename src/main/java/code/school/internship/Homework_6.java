package code.school.internship;

public class Homework_6 {
    public static void main(String[] args) {
        int x = 105;
        if (x % 3 == 0) {
            if (x % 7 == 0)
                System.out.println("The given value x is devided in 3 and 7.");
        }
        else {
            System.out.println("Sorry the value sin't devided in 3 and 7");
        }
        // or we can have following logic
        int y = 21;
        if (y % 3 == 0 && y % 7 == 0) {
            System.out.println("The given value y is devided in 3 and 7.");
        }
        else {
            System.out.println("Sorry the value sin't devided in 3 and 7");
           }
    }
}

