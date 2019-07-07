package code.school.internship;

public class SumOfFollowingSeries {
    public static void main(String[] args) {
        //1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n
        double i=1,result=0;
        int n=3;
        do {
            result=result+1/i;
            i++;
        } while(i<=n);
        System.out.println(result);

    }
}
