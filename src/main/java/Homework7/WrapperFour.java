package Homework7;

public class WrapperFour {
    public boolean even(int a, int b, int c){
        if (a%2==0 && b%2==0 && c%2==0){
            System.out.println("The given numbers are even " + a + " " + b + " " + c);
            return true;
        }
        else {
            System.out.println("Not all given numbers are even " + a + " " + b + " " + c);
            return false;
        }

    }
}
