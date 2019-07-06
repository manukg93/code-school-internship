package code.school.internship;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++){

            if(i == 5) {
                return;
            }
            System.out.println("The value is " + i);
        }

        System.out.println("Inside main method");
    }
}
