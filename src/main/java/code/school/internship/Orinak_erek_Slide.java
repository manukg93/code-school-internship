package code.school.internship;

public class Orinak_erek_Slide {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        // a boolean value can control the if statement
        if(b) System.out.println("This is executed.");
        b = false;
        if(b) System.out.println("This is not executed.");
        // outcome of a relation operator is a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
        boolean c, d;
        c = true;
        System.out.println("D is " + c);
        d = false;
        System.out.println("D is " + d);
        System.out.println("10 + 10 * 10 = 110. " + (10 + 10 * 10 == 110));
        if(c) System.out.println("You have C+ note.");
        if(d) System.out.println("Try again");
    }
}
