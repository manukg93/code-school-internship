package code.school.internship;

public class DigitDivides {
    public static void main(String[] args){
        //Напишите программу, которая проверяет,делится ли данная цифра на 3 и 7,
        // используя if-else-if, if-nested if, if с логическими операторами (&&)
        int x=21;
        if(x%3==0){
            System.out.println("The number is divides in three.");
        } else System.out.println("The number is not divides in three.");
        if(x%7==0){
            System.out.println("The number is divides in seven.");
        } else System.out.println("The number is not divides in seven");
        if(x%3==0 && x%7==0){
            System.out.println("The number is 21 or multiples 21");
        }
    }
}
