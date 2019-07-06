package code.school.internship;

public class MinMax {
    public static void main(String args []) {
        double n1 = 1.0;
        double n2 = 5.0;
        double n3 = 0.0;

        double min = n1;
        double max = n1;

        if (min > n2) {
            min = n2;
        }

        if (min > n3) {
            min = n3;
        }

        if (max < n2)
            max = n2;


        if (max < n3)
            max = n3;

        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }
}
