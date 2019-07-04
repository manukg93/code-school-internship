package code.school.internship;

public class if_else_if {
    public static void main(String[] args) {
        int i=21;
        if (i%3==0){
            System.out.println("The number is divides to three" );
        } if (i%7==0){
            System.out.println("The number is divides to seven");
        } if (i%3==0 && i%7==0){
            System.out.println("The number is 21 or multiples 21");
        } else {
            System.out.println("The number is not divides to 3 or 7");
        }

    }
}
