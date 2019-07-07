package code.school.internship;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.print("a+b=" + (a + b));
        System.out.println("    a+b=" + (a += b));
        System.out.print("a-b=" + (a - b));
        System.out.println("    a-b=" + (a -= b));
        System.out.print("a/b=" + (a / b));
        System.out.println("     a/b=" + (a /= b));
        System.out.print("a*b=" + a * b);
        System.out.println("    a*b=" + (a *= b));
        System.out.print("a%b=" + (a % b));
        System.out.println("     a%b=" + (a %= b));
    }
}
