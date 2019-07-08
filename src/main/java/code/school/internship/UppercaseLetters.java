package code.school.internship;

public class UppercaseLetters {
    public static void main(String[] args) {
        //{'a','A','N','?','.','P','v','T','f','0','i','1','L','k','m','H'}  65 90
        char [] Array={'a','A','N','?','.','P','v','T','f','0','i','1','L','k','m','H'};
        for(int i=0;i<Array.length;i++) {
            if (Array[i]>=65 && Array[i]<=90){
                System.out.println(Array[i]);
            }
        }
    }
}
