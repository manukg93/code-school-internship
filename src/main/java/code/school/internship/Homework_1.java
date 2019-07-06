package code.school.internship;

public class Homework_1 {
    public static void main(String[] args) {
        int a = 55, b = 5, c = 10;
        System.out.println("a + b + c = " + (a + b + c));
        int d = 10, e = 10;
        System.out.println("(a*d + e*b)*e = " + ((a*d + e*b)*e));
        int f = a+10;
        System.out.println("a+b-f = " + (a + b - f));
        System.out.println("(a+b)*c/f = " + ((a+b)*c/f));
        System.out.println("a % c = " + (a % c));
        System.out.println("a += b is equal to " + (a = a + b));
        System.out.println("a -= f*b is equal to " + (a = (a-f)*b));
        System.out.println("a *= e is equal to " + (a = a * e));
        System.out.println("a /= e is equal to " + (a = a / e));
        System.out.println("a %= e+f is equal to " + (a = a % (e+f)));
    }
}
