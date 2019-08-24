package code.school.internship.homework1_2_3;

public class SumOfFollowingSeries {
    /*n = 10000.
            1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n*/
    public static void main(String[] args) {
        double i=1, result=0;
        int n=10000;

        do {
            result=result+1/i;
            i++;
        } while (i<=n);
        System.out.println(result);
    }
}
