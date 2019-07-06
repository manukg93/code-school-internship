package code.school.internship;

public class Homework_13 {
    public static void main(String[] args) {
        float a = 0.1111f;
        if (a==0)
            System.out.println("Zero");
        else if (a>0)
            System.out.println("Positive");
        if (a<0)
            System.out.println("Negative");
        else if (a>0&&a<1)
            System.out.println("Small");
        else if (a>0&&a>1000000)
            System.out.println("Large");
    }
}
