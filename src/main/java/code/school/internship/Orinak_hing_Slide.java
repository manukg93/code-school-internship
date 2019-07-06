package code.school.internship;

public class Orinak_hing_Slide {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
        boolean condition = true;
        // pre-increment operator
        // a = a+1 and than c = a;
        c = ++a;
        System.out.println("Value of c (++a) = " + c);
        // post increment operator
        // c=b then b=b+1
        c = --d;
        System.out.println("value of c (--d) = " + c);
        // port-decrement operator
        //c=e then e=e-1
        c = e--;
        System.out.println("Value of c(e--) = " + c);
        // Logical not perator
        System.out.println("Value of !condition = " + !condition);
    }
}
