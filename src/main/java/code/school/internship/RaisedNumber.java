package code.school.internship;

public class RaisedNumber {
    public static void main(String[] args) {
        //m֊ի n աստիճանը Value=n*n*n*n*n*n*n*n
        int n = 2, m = 9, Value=1;
        for(int i=1;i<=n; i++){
            Value=Value*m;
        }
        System.out.println("n^m=" + Value);
    }
}
