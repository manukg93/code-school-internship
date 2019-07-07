package code.school.internship;
import java.util.Scanner;
public class SumAverageFiveNumbers {
    public static void main(String[] args) {
        System.out.println("Import five numbers");
        double num1, num2 ,num3 ,num4 , num5;
        Scanner in = new Scanner(System.in);
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        num3 = in.nextDouble();
        num4 = in.nextDouble();
        num5 = in.nextDouble();
        System.out.println("SUM="+(num1+num2+num3+num4+num5));
        System.out.println("AVERAGE="+(num1+num2+num3+num4+num5)/5);
    }
}
