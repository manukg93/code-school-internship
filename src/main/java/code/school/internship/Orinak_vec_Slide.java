package code.school.internship;

public class Orinak_vec_Slide {
    public static void main(String[] args) {
        int i = 10;
        if (i > 15)
            System.out.println("10 is less than 15");
        // This statement will be executed
        // as if considers one statement by default
        System.out.println("I am Not in if");
        int l = 10;
        if (l < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("l is greater than 15");
        int m = 20;
        if (m == 10)
            System.out.println("m is 10");
        else if (m == 15)
            System.out.println("m is 15");
        else if (m == 20)
            System.out.println("m is 20");
        else
            System.out.println("m is not present");

    }
}