package code.school.internship;

public class Orinak_mek_Slide {
    public static void main(String[] args) {
        double pi, r, a;
        r = 10.8; // radius of circle
        pi = 3.1416; // pi, approximately
        a = pi * r * r; // compute area
        System.out.println("Area of circle is " + a);
        double x, y, z;
        x = 105000; // prix client
        y = 10; // honoraires en %
        z = x * y / 100; // Honoraires en euro
        System.out.println("Prix client 105000");
        System.out.println("Honoraires en euro " + z);
        double i = x + z; // prix toutes charges comprises
        System.out.println("Prix CC " + a);
    }
}
