package code.school.internship.Lesson2.ControlStatements;

public class MaxMin {
    public static void main(String[] args) {
        double n1 = 11.2;
        double n2 = -22.6;
        double n3 = 2.5;
        double n4 = 0;

        // finding max value
        double max = n1;

        if(n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        if (n4 > max) {
            max = n4;
        }

        System.out.println("Maximum value is: " + max);

        // finding min value
        double min = n1;

        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }
        if (n4 < min) {
            min = n4;
        }

        System.out.println("Minimum value is: " + min);

    }
}
