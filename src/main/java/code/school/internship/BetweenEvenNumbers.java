package code.school.internship;

public class BetweenEvenNumbers {
    public static void main(String[] args) {
        //Given firstNum = 13, secondNum = 50
        //1. Output all even numbers between firstNum and secindNum
        //2. Output the sum of all odd numbers between firstNum and secindNum
        int n1=13,n2=50;
        int [] Array= new int[n2+1];
        int Sum=0;
        for(int i=1; i<Array.length; i+=2){
            if(i>=n1 && i<=n2){
                Array[i]=i;
                Sum+=i;
                System.out.println(i);
            }

        }
        System.out.println("The sum of all odd numbers between n1 and n2 = " + Sum);

    }
}
