package code.school.internship;

public class DigitDividesFiveOrSix {
    public static void main(String[] args) {
        int digit=31;
        if(digit%5==0||digit%6==0){
            System.out.println("Given digit divides onto 5 or 6.");
        } else {
            System.out.println("Given digit is not divides onto 5 or 6.");
        }
    }
}
