package code.school.internship;

public class WhileDemo {
    public static void main(String[] args) {
   /*     int x = 1;
        while (x <= 4){
            System.out.println("The value of x is " + x);
            x++;
        }

 */

        int y = 11;
        do{
            int x = 1;
            while (x < 5){
                System.out.println("The value of x is " + x);
                x++;
            }
            System.out.println("The value of y is " + y);
            y++;
        }while (y < 21);

    }


}
