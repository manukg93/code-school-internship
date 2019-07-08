package code.school.internship;

public class Homework_8 {
    public static void main(String[] args){
        double n1 = 1.2, n2 = 0.6, n3 = -2.5, n4 = 0;
       if (n1>n2&&n1>n3&&n1>n4)
           System.out.println("The max number is " + (n1));
       else
           System.out.println("The min number is " + (n1));
       if (n2<n3&&n2<n4)
           System.out.println("The min number is " + (n2));
       else if (n3<n4)
           System.out.println("The min number is " + (n3));
           else
               System.out.println("The min number is " + (n4));
    }
}
