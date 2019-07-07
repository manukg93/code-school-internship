package code.school.internship;

public class FloatingPoint {
    public static void main(String[] args) {
        float x=-6543289.56f;
        if(x==0){
            System.out.println("The number is null.");
        } else if(x<0){
            System.out.print("The number is negative");
        }else {
            System.out.print("The number is positive");
        }
        if(Math.abs(x)<1){
            System.out.println(" & small.");
        } else if(Math.abs(x)>1000000){
            System.out.println(" & large.");
        }

    }
}
