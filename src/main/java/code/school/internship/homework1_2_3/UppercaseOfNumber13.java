package code.school.internship.homework1_2_3;

public class UppercaseOfNumber13 {
    // array = {'a','A','N','?','.','P','v','T','f','0','i','1','L','k','m','H'}.
    public static void main(String[] args) {
        char[] Array = {'a', 'A', 'N', '?', '.', 'P', 'v', 'T', 'f', '0', 'i', '1', 'L', 'k', 'm', 'H'};
        for (int i = 0; i < Array.length; i++) {

            if (Array[i] >= 65 && Array[i] <= 90) {
                System.out.print(Array[i] + "  ");

            }

        }
    }
}