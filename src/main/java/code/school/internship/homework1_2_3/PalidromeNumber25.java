package code.school.internship.homework1_2_3;

public class PalidromeNumber25 {
    public static void main(String[] args) {
        int x = 123000321;
        int revers = 0;
        int temp = x;
        while (x != 0) {
            int reminder = x % 10;
            revers = revers * 10 + reminder;
            x = x / 10;
        }
        if (temp  == revers) {
            System.out.println("The number i palindrome");

        }else
        System.out.println("The number is not palindrome");

    }

}
