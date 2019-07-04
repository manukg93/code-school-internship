package code.school.internship;

public class Nested_if {
    public static void main(String[] args) {
        int num=210;
        if (num%5==0){
            System.out.println("The number is divides to five");
            if(num%6==0){
                System.out.println("The number is 30 or multiples 30");
             if(num%7==0) {
                 System.out.println("The number is 210");
             }
            }
        }
    }
}
