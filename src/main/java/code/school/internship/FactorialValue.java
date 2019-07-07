package code.school.internship;

public class FactorialValue {
    public static void main(String[] args) {
        int num = 25;
        long Value = 1;
        for(int i = 1; i <= num; i++)
        {
            Value *= i;
        }
        System.out.print(num+ "!" + "="+Value );

    }
}